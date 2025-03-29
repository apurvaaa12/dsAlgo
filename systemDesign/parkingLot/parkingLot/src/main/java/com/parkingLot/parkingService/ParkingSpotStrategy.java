package com.parkingLot.parkingService;

import com.parkingLot.entity.ParkingSpot;

import java.util.List;
import java.util.Optional;

public interface ParkingSpotStrategy {
    Optional<ParkingSpot> findParkingSpot(List<ParkingSpot> parkings);
}
