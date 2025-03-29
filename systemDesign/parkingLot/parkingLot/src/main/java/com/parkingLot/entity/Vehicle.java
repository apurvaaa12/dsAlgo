package com.parkingLot.entity;

import com.parkingLot.enums.VehicleType;

public class Vehicle {

    VehicleType vehicleType;
    String color;
    String vehicleNumber;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", color='" + color + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}
