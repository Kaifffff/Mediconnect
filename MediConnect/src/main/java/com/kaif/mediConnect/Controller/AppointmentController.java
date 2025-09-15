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

import com.kaif.mediConnect.DTO.AppointmentRequest;
import com.kaif.mediConnect.Model.Appointment;
import com.kaif.mediConnect.Service.AppointmentService;

@RestController
@RequestMapping("/Appointments")
@CrossOrigin(origins = "http://localhost:5173") 
public class AppointmentController {
	
	    @Autowired
	    AppointmentService service;
	
	    
	    //Book Appointments
	    @PostMapping("/book")
	    public String bookAppointment(@RequestBody AppointmentRequest request) {
	        return service.bookAppointment(request);
	    }

	    //Fetch All Appointments 
	    @GetMapping
	    public List<Appointment> getAllAppointments() {
	        return service.getAllAppointments();
	    }
	    
	    //Fetch Appointments By Id
	    @GetMapping("/getById/{id}")
	    public Appointment getAppointmentById(@PathVariable Long id) {
	    	return service.getAppointmentById(id);
	    }
	    
	    //Fetch Appointments By Patient ID
	    @GetMapping("/getByPatientId/{id}")
	    public List<Appointment> getAppointmentByPatientId(@PathVariable Long id){
	    	return service.getAppointmentByPatientId(id);
	    }
	    
	    //Fetch Appointments By Doctor Id
	    @GetMapping("/getByDoctorId/{id}")
	    public List<Appointment> getAppointmentByDoctorId(@PathVariable Long id){
	    	return service.getAppointmentByDoctorId(id);
	    }
	    
	    //Delete Appointments By Doctor Id
	    @DeleteMapping("/deleteByDoctorId/{id}")
	    public String deleteByDoctorId(@PathVariable Long id) {
	    	return service.deleteByDoctorId(id);
	    }
	    
	    //Delete Appointments By Patient Id
	    @DeleteMapping("/deleteByPatientId/{id}")
	    public String deleteByPatientId(@PathVariable Long id) {
	    	return service.deleteByPatientId(id);
	    }
	    
	    //Delete All Appointments 
	    @DeleteMapping("/deleteAll")
	    public String deleteAllAppointments() {
	    	return service.deleteAllAppointments();
	    }
}
