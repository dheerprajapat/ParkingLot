import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private List<ParkingSpot> spots;
    private int motorcycleSpots, compactSpots, regularSpots;

    public ParkingLot(int motorcycleSpots, int compactSpots, int regularSpots) {
        this.motorcycleSpots = motorcycleSpots;
        this.compactSpots = compactSpots;
        this.regularSpots = regularSpots;
        this.spots = new ArrayList<>();

        for (int i = 0; i < motorcycleSpots; i++) spots.add(new ParkingSpot(SpotType.MOTORCYCLE));
        for (int i = 0; i < compactSpots; i++) spots.add(new ParkingSpot(SpotType.COMPACT));
        for (int i = 0; i < regularSpots; i++) spots.add(new ParkingSpot(SpotType.REGULAR));
    }

    public int getAvailableSpots() {
        return (int) spots.stream().filter(ParkingSpot::isAvailable).count();
    }

    public int getTotalSpots() {
        return spots.size();
    }

    public boolean isFull() {
        return getAvailableSpots() == 0;
    }

    public boolean isEmpty() {
        return getAvailableSpots() == getTotalSpots();
    }

    public long getOccupiedSpots(SpotType type) {
        return spots.stream().filter(s -> s.getType() == type && !s.isAvailable()).count();
    }

    public int getVanOccupiedSpots() {
        return (int) spots.stream().filter(s -> s.getType() == SpotType.REGULAR && !s.isAvailable()).count();
    }
}