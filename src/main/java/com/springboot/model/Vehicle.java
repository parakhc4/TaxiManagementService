package com.springboot.model;

import com.springboot.model.enums.*;

import java.util.Objects;

public class Vehicle {
    private VehicleType vehicleType;
    private String vehicleNumber;


    public Vehicle(VehicleType vehicleType, String vehicleNumber) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Vehicle vehicleType(VehicleType vehicleType) {
        setVehicleType(vehicleType);
        return this;
    }

    public Vehicle vehicleNumber(String vehicleNumber) {
        setVehicleNumber(vehicleNumber);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehicle)) {
            return false;
        }
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vehicleType, vehicle.vehicleType) && Objects.equals(vehicleNumber, vehicle.vehicleNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, vehicleNumber);
    }

    @Override
    public String toString() {
        return "{" +
            " vehicleType='" + getVehicleType() + "'" +
            ", vehicleNumber='" + getVehicleNumber() + "'" +
            "}";
    }
}
