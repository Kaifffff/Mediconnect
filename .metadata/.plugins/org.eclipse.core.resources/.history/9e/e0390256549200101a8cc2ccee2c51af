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
import org.springframework.web.bind.annotation.RestController;

import com.kaif.mediConnect.Model.Doctor;
import com.kaif.mediConnect.Service.DoctorService;

@RestController
@RequestMapping("/Doctors")
@CrossOrigin(origins = "http://localhost:5173") 
public class DoctorController {
	
	    @Autowired
	    DoctorService service;
	
	    @GetMapping
	    public List<Doctor> getAllDoctors() {
	        return service.getAllDoctors();
	    }

	    @PostMapping
	    public Doctor createDoctor(@RequestBody Doctor doctor) {
	        return service.createDoctor(doctor);
	    }
	    
	    @DeleteMapping("/Delete/{id}")
	    public String delete(@PathVariable Long id) {
	    	service.del(id);
	    	return "Deleted";
	    }
	    
	    @DeleteMapping("/DeleteAll")
	    public String deleteAllDoctors() {
	    	return service.deleteAllDoctor();
	    }
}
