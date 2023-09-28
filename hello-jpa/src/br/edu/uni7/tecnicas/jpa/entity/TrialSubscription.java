package br.edu.uni7.tecnicas.jpa.entity;

import java.util.Calendar;

import jakarta.persistence.Entity;

@Entity
public class TrialSubscription extends Subscription{
	private Calendar endDate;

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	
	
}
