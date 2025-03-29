package com.parkingLot.parkingService.costComputationStrategy;

import com.parkingLot.enums.VehicleType;

public interface CostComputation {
    int calculateCostForTicket(VehicleType vehicleType);
}
