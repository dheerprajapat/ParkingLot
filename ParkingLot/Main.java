public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(5, 10, 20);

        System.out.println("Total spots: " + lot.getTotalSpots());
        System.out.println("Available spots: " + lot.getAvailableSpots());
        System.out.println("Is the parking lot full? " + lot.isFull());
        System.out.println("Is the parking lot empty? " + lot.isEmpty());
        System.out.println("Occupied motorcycle spots: " + lot.getOccupiedSpots(SpotType.MOTORCYCLE));
        System.out.println("Van occupied spots: " + lot.getVanOccupiedSpots());
    }
}
