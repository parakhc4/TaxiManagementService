package com.springboot.model;

import com.springboot.model.enums.*;


import java.util.*; 
import java.util.Objects;


public class Driver extends User {
    private Vehicle vehicle;
    private DriverStatus driverStatus;
    private Long totalEarning;
    private List<Ride> rideHistory;


    public Driver(String name,Vehicle vehicle, DriverStatus driverStatus, Long totalEarning) {
        super(name);
        this.vehicle = vehicle;
        this.driverStatus = DriverStatus.AVAILABLE;
        this.totalEarning = Long.valueOf(0);
        this.rideHistory = new ArrayList<Ride>();
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public DriverStatus getDriverStatus() {
        return this.driverStatus;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

    public Long getTotalEarning() {
        return this.totalEarning;
    }

    public void setTotalEarning(Long totalEarning) {
        this.totalEarning = totalEarning;
    }

    public List<Ride> getRideHistory() {
        return this.rideHistory;
    }

    public void setRideHistory(List<Ride> rideHistory) {
        this.rideHistory = rideHistory;
    }

    public Driver vehicle(Vehicle vehicle) {
        setVehicle(vehicle);
        return this;
    }

    public Driver driverStatus(DriverStatus driverStatus) {
        setDriverStatus(driverStatus);
        return this;
    }

    public Driver totalEarning(Long totalEarning) {
        setTotalEarning(totalEarning);
        return this;
    }

    public Driver rideHistory(List<Ride> rideHistory) {
        setRideHistory(rideHistory);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Driver)) {
            return false;
        }
        Driver driver = (Driver) o;
        return Objects.equals(vehicle, driver.vehicle) && Objects.equals(driverStatus, driver.driverStatus) && Objects.equals(totalEarning, driver.totalEarning) && Objects.equals(rideHistory, driver.rideHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicle, driverStatus, totalEarning, rideHistory);
    }

    @Override
    public String toString() {
        return "{" +
            " vehicle='" + getVehicle() + "'" +
            ", driverStatus='" + getDriverStatus() + "'" +
            ", totalEarning='" + getTotalEarning() + "'" +
            ", rideHistory='" + getRideHistory() + "'" +
            "}";
    }
    

}
