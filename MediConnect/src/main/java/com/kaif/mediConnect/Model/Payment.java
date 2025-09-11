package com.kaif.mediConnect.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @OneToOne
	    private Appointment appointment;

	    private int paymentAmount;
	    private String paymentDate;
	    private String paymentMethod;
	    private String status;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Appointment getAppointment() {
			return appointment;
		}
		public void setAppointment(Appointment appointment) {
			this.appointment = appointment;
		}
		public int getPaymentAmount() {
			return paymentAmount;
		}
		public void setPaymentAmount(int paymentAmount) {
			this.paymentAmount = paymentAmount;
		}
		public String getPaymentDate() {
			return paymentDate;
		}
		public void setPaymentDate(String paymentDate) {
			this.paymentDate = paymentDate;
		}
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Payment [id=" + id + ", appointment=" + appointment + ", paymentAmount=" + paymentAmount
					+ ", paymentDate=" + paymentDate + ", paymentMethod=" + paymentMethod + ", status=" + status + "]";
		}
	    
	    
}
