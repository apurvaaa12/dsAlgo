package com.parkingLot.entity;

import com.parkingLot.enums.ParkingType;

public class FourWheelerParking implements ParkingSpot{
    private boolean isOccupied;
    private int noOfFloor;
    private int price;

    @Override
    public boolean isEmpty() {
        return !isOccupied;
    }

    @Override
    public void occupy() {
        this.isOccupied = true;
    }

    @Override
    public void vacateParkingSpot() {
        this.isOccupied = false;
    }

    @Override
    public ParkingType getType() {
        return ParkingType.FOUR_WHEELER;
    }
}
