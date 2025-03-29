package com.parkingLot.parkingService.parkingStrategy;

import com.parkingLot.entity.ParkingSpot;
import com.parkingLot.enums.ParkingType;

import java.util.List;
import java.util.Optional;

public class DefaultParkingStrategy implements ParkingSpotStrategy {
    @Override
    public Optional<ParkingSpot> findParkingSpot(List<ParkingSpot> parkings) {
        return parkings.stream()
                .filter(parkingSpot -> parkingSpot.getType()
                        .equals(ParkingType.TWO_WHEELER) && parkingSpot.isEmpty())
                .findFirst();
    }
}
