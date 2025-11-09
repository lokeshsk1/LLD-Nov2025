package ParkingLotLLD;

public class Vehicle {
    private String regNo;
    private VehicleType type;

    public Vehicle(String regNo, VehicleType type) {
        this.regNo = regNo;
        this.type = type;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regNo='" + regNo + '\'' +
                ", type=" + type +
                '}';
    }
}
