package br.edu.uni7.tecnicas.jpa.entity;

import jakarta.persistence.Entity;

@Entity
public class LifetimeSubscription extends Subscription{
	private boolean eliteClub;

	public boolean getEliteClub() {
		return eliteClub;
	}

	public void setEliteClub(boolean eliteClub) {
		this.eliteClub = eliteClub;
	}
	
	
}
