package com.parkingLot.enums;

public enum ParkingType {
    TWO_WHEELER("twoWheeler"),
    THREE_WHEELER("threeWheeler"),
    FOUR_WHEELER("fourWheeler");

    private final String value;

    ParkingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
