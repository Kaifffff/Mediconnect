package com.kaif.mediConnect.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaif.mediConnect.Model.Payment;

public interface PaymentRepo extends JpaRepository<Payment , Long> {
	public void deleteByAppointment_Id(Long id);
}
