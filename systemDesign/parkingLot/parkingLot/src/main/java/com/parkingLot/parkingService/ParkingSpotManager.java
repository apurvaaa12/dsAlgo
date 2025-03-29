package com.parkingLot.parkingService;

import com.parkingLot.entity.ParkingSpot;
import com.parkingLot.entity.Ticket;
import com.parkingLot.entity.Vehicle;
import com.parkingLot.parkingService.parkingStrategy.ParkingSpotStrategy;

import java.util.List;
import java.util.Optional;

public class ParkingSpotManager {
    private List<ParkingSpot> parkings;

    public Optional<ParkingSpot> findParkingSpot(ParkingSpotStrategy ps){
        return ps.findParkingSpot(parkings);
    }

    public boolean parkVehicle(Vehicle v, Ticket t, ParkingSpotStrategy ps){
        Optional<ParkingSpot> parkingSpot = findParkingSpot(ps);
        if(parkingSpot.isPresent()){
            parkingSpot.get().occupy();
            return true;
        }
        return false;
    }
}
