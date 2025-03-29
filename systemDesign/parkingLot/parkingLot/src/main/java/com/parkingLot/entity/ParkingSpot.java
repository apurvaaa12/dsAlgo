package com.parkingLot.entity;

import com.parkingLot.enums.ParkingType;

public interface ParkingSpot {
    public boolean isEmpty();
    public void occupy();
    public void vacateParkingSpot();
    public ParkingType getType();
}
