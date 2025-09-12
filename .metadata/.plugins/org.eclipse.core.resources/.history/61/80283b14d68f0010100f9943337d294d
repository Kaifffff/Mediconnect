package com.kaif.mediConnect.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String name;
	 private String specialization;
     private int experience;
     private String availableFrom;
     private String availableTo;
     private double consultationFee;
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
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", experience="
				+ experience + ", availableFrom=" + availableFrom + ", availableTo=" + availableTo
				+ ", consultationFee=" + consultationFee + "]";
	 }
     
     
}
