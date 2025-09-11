package com.kaif.mediConnect.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaif.mediConnect.Model.Patient;

public interface PatientRepo extends JpaRepository<Patient , Long>{

}
