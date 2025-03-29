package com.parkingLot.parkingService.costComputationStrategy;

import com.parkingLot.enums.VehicleType;

public class MinuteBasedCostStrategy implements CostComputation {
    @Override
    public int calculateCostForTicket(VehicleType vehicleType) {
        return 0;
    }
}
