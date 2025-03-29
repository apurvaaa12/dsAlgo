package com.parkingLot.parkingService.costComputationStrategy;

import com.parkingLot.enums.VehicleType;

public class DefaultCostStrategy implements CostComputation {
    @Override
    public int calculateCostForTicket(VehicleType vehicleType) {
        return 0;
    }
}
