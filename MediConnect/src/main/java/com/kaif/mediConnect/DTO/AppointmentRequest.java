package com.kaif.mediConnect.DTO;

public class AppointmentRequest {
	private Long doctorId;
    private String patientName;
    private String patientAddress;
    private String patientDateOfBirth;
    private String patientGender;
    private String appointmentDate;
    private String appointmentTime;
    private String remarks;
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientDateOfBirth() {
		return patientDateOfBirth;
	}
	public void setPatientDateOfBirth(String patientDateOfBirth) {
		this.patientDateOfBirth = patientDateOfBirth;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "AppointmentRequest [doctorId=" + doctorId + ", patientName=" + patientName + ", patientAddress="
				+ patientAddress + ", patientDateOfBirth=" + patientDateOfBirth + ", patientGender=" + patientGender
				+ ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime + ", remarks="
				+ remarks + "]";
	}
    
}
