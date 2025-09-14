package com.kaif.mediConnect.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaif.mediConnect.DTO.AppointmentRequest;
import com.kaif.mediConnect.Model.Appointment;
import com.kaif.mediConnect.Model.Doctor;
import com.kaif.mediConnect.Model.Patient;
import com.kaif.mediConnect.Repo.AppointmentRepo;
import com.kaif.mediConnect.Repo.DoctorRepo;
import com.kaif.mediConnect.Repo.PatientRepo;
import com.kaif.mediConnect.Service.AppointmentService;

@Service
public class AppointmentDao implements AppointmentService{
	
	@Autowired
	AppointmentRepo ar;
	
	@Autowired
	DoctorRepo dr;
	
	@Autowired
	PatientRepo pr;

	@Override
	public String bookAppointment(AppointmentRequest request) {
		
		  Optional<Doctor> doctorOpt = dr.findById(request.getDoctorId());
	        if (!doctorOpt.isPresent()) {
	            return "Doctor not found";
	        }

	        Doctor doctor = doctorOpt.get();

	        Patient patient = new Patient();
	        patient.setName(request.getPatientName());
	        patient.setAddress(request.getPatientAddress());
	        patient.setDateOfBirth(request.getPatientDateOfBirth());
	        patient.setGender(request.getPatientGender());
	        patient.setMedicalHistory(""); // optional

	        patient = pr.save(patient);

	        Appointment appointment = new Appointment();
	        appointment.setDoctor(doctor);
	        appointment.setPatient(patient);
	        appointment.setAppointmentDate(request.getAppointmentDate());
	        appointment.setAppointmentTime(request.getAppointmentTime());
	        appointment.setStatus("Booked");
	        appointment.setRemarks(request.getRemarks());

	        ar.save(appointment);

	        return "Appointment booked successfully";
	    }
	

	@Override
	public List<Appointment> getAllAppointments() {
	
		return ar.findAll();
	}

}
