package com.kaif.mediConnect.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaif.mediConnect.Model.Patient;
import com.kaif.mediConnect.Service.PatientService;

@RestController
@RequestMapping("/Patients")
@CrossOrigin(origins = "http://localhost:5173") 
public class PatientController {
	
	    @Autowired
	    PatientService service;
	
	    //Fetch All Patients
	    @GetMapping
	    public List<Patient> getAllPatients() {
	        return service.getAllPatients();
	    }
	    
	    //Fetch Patient By Id
	    @GetMapping("/getById/{id}")
	    public Patient getById(@PathVariable Long id) {
	    	return service.getById(id);
	    }
	    
	    // Fetch Patient By Email And Password
	    @GetMapping("/getByEmailAndPassword/")
	    public Patient getByEmailAndPassword(@RequestParam String email , @RequestParam String password) {
	    	return service.getByEmailAndPassword(email,password);
	    }
	    
	    
	    //Register New Patient
	    @PostMapping
	    public Patient createPatients(@RequestBody Patient patient) {
	        return service.createPatients(patient);
	    }
	    
	    //Delete By Patient Id
	    @DeleteMapping("/delete/{id}")
	    public String deleteById(@PathVariable Long id){
	    	return service.deleteById(id);
	    }
	    
	    //Delete All Patients
	    @DeleteMapping("/deleteAll")
	    public String deleteAll(){
	    	return service.deleteAll();
	    }

}
