package com.kaif.mediConnect.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaif.mediConnect.Model.Doctor;
import com.kaif.mediConnect.Repo.DoctorRepo;
import com.kaif.mediConnect.Service.DoctorService;

@Service
public class DoctorDao implements DoctorService{

	@Autowired
	DoctorRepo dr;
	
	@Override
	public List<Doctor> getAllDoctors() {
		
		return dr.findAll();
	}

	@Override
	public Doctor createDoctor(Doctor doctor) {
		
		return dr.save(doctor);
	}

}
