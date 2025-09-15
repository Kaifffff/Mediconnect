package com.kaif.mediConnect.Service;

import java.util.List;

import com.kaif.mediConnect.Model.Patient;

public interface PatientService {
	public List<Patient> getAllPatients() ;
	public Patient createPatients(Patient patient);
	public String deleteById(Long id);
	public String deleteAll();
	public Patient getById(Long id);
	public Patient getByEmailAndPassword(String email, String password); 
}
