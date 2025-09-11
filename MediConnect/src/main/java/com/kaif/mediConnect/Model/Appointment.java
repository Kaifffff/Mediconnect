package com.kaif.mediConnect.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointment {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    private Doctor doctor;

	    @ManyToOne
	    private Patient patient;

	    private String appointmentDate;
	    private String appointmentTime;
	    private String status;
	    private String remarks;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Doctor getDoctor() {
			return doctor;
		}
		public void setDoctor(Doctor doctor) {
			this.doctor = doctor;
		}
		public Patient getPatient() {
			return patient;
		}
		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		public String getAppointmentDate() {
			return appointmentDate;
		}
		public void setAppointmentDate(String appointmentDate) {
			this.appointmentDate = appointmentDate;
		}
		public String getAppointmentTime() {
			return appointmentTime;
		}
		public void setAppointmentTime(String appointmentTime) {
			this.appointmentTime = appointmentTime;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		@Override
		public String toString() {
			return "Appointment [id=" + id + ", doctor=" + doctor + ", patient=" + patient + ", appointmentDate="
					+ appointmentDate + ", appointmentTime=" + appointmentTime + ", status=" + status + ", remarks="
					+ remarks + "]";
		}
	    
	    
}
