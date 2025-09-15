package com.kaif.mediConnect.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaif.mediConnect.Model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor , Long>{

	Doctor findByEmailAndPassword(String email , String password);
	List<Doctor> findByNameContainingIgnoreCase(String name);
}
