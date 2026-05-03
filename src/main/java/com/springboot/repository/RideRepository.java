package com.springboot.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springboot.model.Ride;

@Repository
public class RideRepository {
    private final Map<Long,Ride> rideHistory = new HashMap<>();

    public Ride save(Ride ride){
        rideHistory.put(ride.getId(),ride);
        return ride;
    }


}
