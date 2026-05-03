package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.model.Rider;
import com.springboot.repository.RiderRepository;

@Service
public class RiderService {
    private final RiderRepository riderRepository;

    public RiderService(RiderRepository riderRepository){
        this.riderRepository = riderRepository;
    }

    public Rider registerRider(String name){
        return riderRepository.save(new Rider(name));
    }
}
