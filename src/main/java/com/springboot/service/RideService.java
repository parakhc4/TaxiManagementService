package com.springboot.service;

import java.math.MathContext;

import org.springframework.stereotype.Service;

import com.springboot.model.Driver;
import com.springboot.model.Location;
import com.springboot.model.Ride;
import com.springboot.repository.DriverRepository;
import com.springboot.repository.RideRepository;

@Service
public class RideService {
    
    private final RideRepository rideRepository;
    private final DriverRepository driverRepository;

    public RideService(RideRepository rideRepository,DriverRepository driverRepository){
        this.rideRepository = rideRepository;
        this.driverRepository = driverRepository;
    }

    public Ride bookRide(Rider rider, Location pickLocation, Location dropLocation){

        thisRide = new Ride(rider, null, pickLocation, dropLocation);

    }

    public Driver findNearestDriver(Location location){
        int dest_x = location.getX();
        int dest_y = location.getY();
        Driver nearestDriver;
        for (Driver d:driverRepository.findAll()){
            
        }
    }
}