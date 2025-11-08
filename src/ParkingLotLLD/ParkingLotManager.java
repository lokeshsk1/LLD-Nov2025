package ParkingLotLLD;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingLotManager {

    private final ParkingLot parkingLot;

    public ParkingLotManager(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    Map<String, Ticket> vehicleVsTicket = new HashMap<>();

    public Ticket createTicket(long ticketId, ParkingSpot parkingSpot, Vehicle vehicle, LocalDateTime entryTime) {
        parkingSpot.setVehicle(vehicle);
        Ticket ticket1 = new Ticket(ticketId, parkingSpot, vehicle, entryTime);
        vehicleVsTicket.put(vehicle.getRegNo(), ticket1);
        return ticket1;
    }

    public void exitVehicle(Ticket ticket){

        ticket.setExitTime(LocalDateTime.now());
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.setAvailable(false);
        parkingSpot.setVehicle(null);
    }

    public ParkingSpot getAvailableParkingSpot(Vehicle vehicle){

        for(ParkingSpot parkingSpot : parkingLot.parkingSpots){
            if(parkingSpot.getVehicleType().equals(vehicle.getType()) && parkingSpot.isAvailable()){
                return parkingSpot;
            }
        }

        return null;
    }
}
