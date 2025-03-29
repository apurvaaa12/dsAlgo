package com.parkingLot.parkingService.parkingStrategy;

import com.parkingLot.entity.ParkingSpot;

import java.util.List;
import java.util.Optional;

public class NearEntranceParking implements ParkingSpotStrategy {
    @Override
    public Optional<ParkingSpot> findParkingSpot(List<ParkingSpot> parkings) {
        return Optional.empty();
    }
}
