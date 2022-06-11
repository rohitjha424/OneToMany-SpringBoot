package com.example.onetomany.milestone3.onetomanyspringboot.services;


import org.springframework.stereotype.Component;

import com.example.onetomany.milestone3.onetomanyspringboot.entity.*;

@Component
public interface HospitalService {

    public Hospital saveHospital(Hospital hospital);

    public Hospital findByHospitalId(int hospitalId);
}