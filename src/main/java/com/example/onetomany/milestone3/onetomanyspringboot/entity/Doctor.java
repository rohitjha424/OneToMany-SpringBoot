package com.example.onetomany.milestone3.onetomanyspringboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int doctorId;
	
	 @Column(name = "doctor_name")
	 private String doctorName;
	 
	 @Column(name = "specialist")
	 private String specialist;

	 @Column(name = "Year_of_exp")
	 private int yoe;
	 
	 @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinColumn(name = "hospital_id", referencedColumnName = "hospitalId")
	    @JsonIgnoreProperties("doctorList")
	 
	 private Hospital hospital;

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	 
	 
}
