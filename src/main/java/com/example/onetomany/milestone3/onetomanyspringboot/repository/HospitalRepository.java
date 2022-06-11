package com.example.onetomany.milestone3.onetomanyspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.milestone3.onetomanyspringboot.entity.*;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, String> {
    public Hospital findByHospitalId(int hospitalId);
}
