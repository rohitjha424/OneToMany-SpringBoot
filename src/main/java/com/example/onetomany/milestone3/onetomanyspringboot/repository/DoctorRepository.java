package com.example.onetomany.milestone3.onetomanyspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.milestone3.onetomanyspringboot.entity.*;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {

}