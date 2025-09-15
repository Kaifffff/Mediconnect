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

import com.kaif.mediConnect.Model.Payment;
import com.kaif.mediConnect.Service.PaymentService;

@RestController
@RequestMapping("/Payments")
@CrossOrigin(origins = "http://localhost:5173") 
public class PaymentController {

	   @Autowired 
	   PaymentService service;
	   
	    //Fetch All Payments
	    @GetMapping
	    public List<Payment> getAllPayments() {
	        return service.getAllPayments();
	    }

	    //Pay For Appointment By Appointment Id
	    @PostMapping("/{appointmentId}")
	    public Payment addPayment(@PathVariable Long appointmentId ,@RequestBody Payment payment) {
	        return service.addPayment(appointmentId, payment);
	    }
	    
	    //Delete Payment By Payment Id
	    @DeleteMapping("/delete/{id}")
	    public String delete(@PathVariable Long id) {
	    	return service.deletePayment(id);
	    }
	    
	    //Delete Payment By Appointment Id
	    @DeleteMapping("/deleteByAppointmentId/{id}")
	    public String deleteByAppointmentId(@PathVariable Long id) {
	    	return service.deleteByAppointmentId(id);
	    }
	    
	    //Delete All Payment 
	    @DeleteMapping("/deleteAll")
	    public String deleteAll() {
	    	return service.deleteAllPayments();
	    }
}
