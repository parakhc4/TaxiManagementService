package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.model.Driver;
import com.springboot.model.Vehicle;
import com.springboot.model.enums.VehicleType;
import com.springboot.repository.DriverRepository;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }

    public Driver registerDriver(String name, VehicleType vehicleType, String vehicleNumber){
        return driverRepository.save(new Driver(name,new Vehicle(vehicleType, vehicleNumber)));
    }
    
}
