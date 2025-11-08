package ParkingLotLLD;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots = new ArrayList<>();

    public void addParkingSpot(ParkingSpot parkingSpot1) {
        parkingSpots.add(parkingSpot1);
    }

    public List<ParkingSpot> getParkingSpots(){
        return  parkingSpots;
    }
}
