package com.springboot.model;

import com.springboot.model.enums.*;
import java.util.Objects;
import java.util.Random;

public class Ride {
    private Long id;
    private Rider rider;
    private Driver driver;
    private RideStatus rideStatus;
    private Location startLocation;
    private Location endLocation;
    private Random r = new Random();


    public Ride(Rider rider, Driver driver, Location startLocation, Location endLocation) {
        // this.id = id;
        this.id = r.nextLong();
        this.rider = rider;
        this.driver = driver;
        this.rideStatus = RideStatus.ACTIVE;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rider getRider() {
        return this.rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public RideStatus getRideStatus() {
        return this.rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public Location getStartLocation() {
        return this.startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return this.endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }


    public Ride id(Long id) {
        setId(id);
        return this;
    }

    public Ride rider(Rider rider) {
        setRider(rider);
        return this;
    }

    public Ride driver(Driver driver) {
        setDriver(driver);
        return this;
    }

    public Ride rideStatus(RideStatus rideStatus) {
        setRideStatus(rideStatus);
        return this;
    }

    public Ride startLocation(Location startLocation) {
        setStartLocation(startLocation);
        return this;
    }

    public Ride endLocation(Location endLocation) {
        setEndLocation(endLocation);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ride)) {
            return false;
        }
        Ride ride = (Ride) o;
        return Objects.equals(id, ride.id) && Objects.equals(rider, ride.rider) && Objects.equals(driver, ride.driver) && Objects.equals(rideStatus, ride.rideStatus) && Objects.equals(startLocation, ride.startLocation) && Objects.equals(endLocation, ride.endLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rider, driver, rideStatus, startLocation, endLocation);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", rider='" + getRider() + "'" +
            ", driver='" + getDriver() + "'" +
            ", rideStatus='" + getRideStatus() + "'" +
            ", startLocation='" + getStartLocation() + "'" +
            ", endLocation='" + getEndLocation() + "'" +
            "}";
    }

    
}
