package com.springboot.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.springboot.model.Rider;

@Repository
public class RiderRepository {
    private final Map<Long,Rider> riders = new HashMap<>();

    public Rider save(Rider rider){
        this.riders.put(rider.getId(),rider);
        return rider;
    }
}