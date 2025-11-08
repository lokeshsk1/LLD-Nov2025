package ParkingLotLLD;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public void addParkingSpot(ParkingSpot parkingSpot1) {
        parkingSpots.add(parkingSpot1);
    }
}
