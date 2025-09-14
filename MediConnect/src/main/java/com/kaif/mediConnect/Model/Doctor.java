package com.kaif.mediConnect.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long Id;
	 private String name;
	 private String email;
	 private String password;
	 private String specialization;
     private int experience;
     private String availableFrom;
     private String availableTo;
     private double consultationFee;
	 public Long getId() {
		 return Id;
	 }
	 public void setId(Long id) {
		 Id = id;
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
	 public String getPassword() {
		 return password;
	 }
	 public void setPassword(String password) {
		 this.password = password;
	 }
	 public String getSpecialization() {
		 return specialization;
	 }
	 public void setSpecialization(String specialization) {
		 this.specialization = specialization;
	 }
	 public int getExperience() {
		 return experience;
	 }
	 public void setExperience(int experience) {
		 this.experience = experience;
	 }
	 public String getAvailableFrom() {
		 return availableFrom;
	 }
	 public void setAvailableFrom(String availableFrom) {
		 this.availableFrom = availableFrom;
	 }
	 public String getAvailableTo() {
		 return availableTo;
	 }
	 public void setAvailableTo(String availableTo) {
		 this.availableTo = availableTo;
	 }
	 public double getConsultationFee() {
		 return consultationFee;
	 }
	 public void setConsultationFee(double consultationFee) {
		 this.consultationFee = consultationFee;
	 }
	 @Override
	 public String toString() {
		return "Doctor [Id=" + Id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", specialization=" + specialization + ", experience=" + experience + ", availableFrom="
				+ availableFrom + ", availableTo=" + availableTo + ", consultationFee=" + consultationFee + "]";
	 }

	
	
	 
     
}
