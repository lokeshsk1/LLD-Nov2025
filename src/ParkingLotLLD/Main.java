package ParkingLotLLD;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();
        ParkingLotManager parkingLotManager = new ParkingLotManager(parkingLot);

        Vehicle vehicle1 = new Vehicle("TN09123", VehicleType.CAR);

        ParkingSpot parkingSpot1 = new ParkingSpot("A",1, VehicleType.CAR);
        ParkingSpot parkingSpot2 = new ParkingSpot("B",1, VehicleType.TRUCK);
        parkingLot.addParkingSpot(parkingSpot1);

        //1. Find ParkingSpot
        ParkingSpot parkingSpot = parkingLotManager.getAvailableParkingSpot(vehicle1);

        //2. Create Ticket
        Ticket ticket1 = parkingLotManager.createTicket(1001L, parkingSpot, vehicle1, LocalDateTime.now());

        System.out.println(ticket1);

        //3. Vehicle Exits
        parkingLotManager.exitVehicle(ticket1);
        System.out.println(ticket1);



    }
}
