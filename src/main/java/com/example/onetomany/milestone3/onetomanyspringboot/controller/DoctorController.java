package com.example.onetomany.milestone3.onetomanyspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.onetomany.milestone3.onetomanyspringboot.entity.*;
import com.example.onetomany.milestone3.onetomanyspringboot.repository.*;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @ResponseBody
    @RequestMapping(value = "/doctors")
    public List<Doctor> getHospitalDetails() {
        List<Doctor> doctorresponse = (List<Doctor>) doctorRepository.findAll();

        return doctorresponse;
    }
}