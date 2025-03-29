package com.parkingLot.parkingService;

import com.parkingLot.entity.ParkingSpot;
import com.parkingLot.entity.Ticket;
import com.parkingLot.enums.ParkingType;

public class ExitGate {
    Ticket ticket;
    ParkingSpot parkingSpot = new ParkingSpot() {
        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public void occupy() {

        }

        @Override
        public void vacateParkingSpot() {

        }

        @Override
        public ParkingType getType() {
            return null;
        }
    };

    int payPrice() {
        return 0;
    }

}
