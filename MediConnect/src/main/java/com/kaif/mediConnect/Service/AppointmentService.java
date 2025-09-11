package com.kaif.mediConnect.Service;

import java.util.List;

import com.kaif.mediConnect.DTO.AppointmentRequest;
import com.kaif.mediConnect.Model.Appointment;

public interface AppointmentService {

	public String bookAppointment(AppointmentRequest request);
	public List<Appointment> getAllAppointments();
}
