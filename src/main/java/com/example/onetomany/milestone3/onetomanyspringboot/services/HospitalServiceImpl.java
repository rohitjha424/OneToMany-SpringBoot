package com.example.onetomany.milestone3.onetomanyspringboot.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.milestone3.onetomanyspringboot.entity.*;
import com.example.onetomany.milestone3.onetomanyspringboot.repository.*;


@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public Hospital saveHospital(Hospital hospital) {
        List<Doctor> doctorList = new ArrayList<>();

        // create first doctor
        Doctor doctor1 = new Doctor();
        doctor1.setDoctorName("Rohit");
        doctor1.setSpecialist("Eye Specialist");
        doctor1.setYoe(8);

        // create second doctor
        Doctor doctor2 = new Doctor();
        doctor2.setDoctorName("Bharti");
        doctor2.setSpecialist("Surgen");
        doctor2.setYoe(5);

        // create third doctor
        Doctor doctor3 = new Doctor();
        doctor3.setDoctorName("Piyush");
        doctor3.setSpecialist("psycologist");
        doctor3.setYoe(12);

        // add all doctor into doctorList. Till here we have prepared data for OneToMany
        doctorList.add(doctor1);
        doctorList.add(doctor2);
        doctorList.add(doctor3);

        // Prepare data for ManyToOne
        doctor1.setHospital(hospital);
        doctor2.setHospital(hospital);
        doctor3.setHospital(hospital);

        hospital.setDoctorList(doctorList);
        hospital = hospitalRepository.save(hospital);

        return hospital;

    }

    public Hospital findByHospitalId(int hospitalId) {
        Hospital hospital = hospitalRepository.findByHospitalId(hospitalId);
        return hospital;
    }
}