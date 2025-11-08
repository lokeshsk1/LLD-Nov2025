package ParkingLotLLD;

public class ParkingSpot {
    private String id;
    private int floor;
    private VehicleType vehicleType;
    private boolean isAvailable;
    private Vehicle vehicle;

    public ParkingSpot(String id, int floor, VehicleType vehicleType) {
        this.id = id;
        this.floor = floor;
        this.vehicleType = vehicleType;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id='" + id + '\'' +
                ", floor=" + floor +
                ", vehicleType=" + vehicleType +
                ", isAvailable=" + isAvailable +
                ", vehicle=" + vehicle +
                '}';
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
