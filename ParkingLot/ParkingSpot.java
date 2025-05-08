class ParkingSpot {
    private SpotType type;
    private boolean occupied;

    public ParkingSpot(SpotType type) {
        this.type = type;
        this.occupied = false;
    }

    public boolean isAvailable() {
        return !occupied;
    }

    public void occupy() {
        occupied = true;
    }

    public void vacate() {
        occupied = false;
    }

    public SpotType getType() {
        return type;
    }
}