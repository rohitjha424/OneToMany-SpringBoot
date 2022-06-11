package com.example.onetomany.milestone3.onetomanyspringboot.controller;

import com.example.onetomany.milestone3.onetomanyspringboot.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.onetomany.milestone3.onetomanyspringboot.services.*;

@RestController
@RequestMapping(value = "/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;
    @RequestMapping(value = "/savehospital", method = RequestMethod.POST)
    @ResponseBody
    public Hospital saveHospital(@RequestBody Hospital hospital) {
        Hospital hospitalResponse = hospitalService.saveHospital(hospital);
        return hospitalResponse;
    }
    @RequestMapping(value = "/{hospitalId}", method = RequestMethod.GET)
    @ResponseBody
    public Hospital getHospitalDetails(@PathVariable int hospitalId) {
        Hospital hospitalResponse = hospitalService.findByHospitalId(hospitalId);
        return hospitalResponse;
    }
    
    
}