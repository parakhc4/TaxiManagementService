package com.springboot.repository;

import org.springframework.stereotype.Repository;

import com.springboot.model.Driver;

import java.util.*;


@Repository
public class DriverRepository {
    private final Map<Long,Driver> drivers = new HashMap<>();
    
    public List<Driver> findAll(){
        return new ArrayList<>(drivers.values());
    }
    
    public Driver save(Driver driver){
        this.drivers.put(driver.getId(), driver);
        return driver;
    }
}
