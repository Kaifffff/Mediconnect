package com.kaif.mediConnect.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;
	    private String address;
	    private String dateOfBirth;
	    private String gender;
	    private String medicalHistory;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getMedicalHistory() {
			return medicalHistory;
		}
		public void setMedicalHistory(String medicalHistory) {
			this.medicalHistory = medicalHistory;
		}
		@Override
		public String toString() {
			return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address
					+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", medicalHistory=" + medicalHistory
					+ "]";
		}
		
	    
}
