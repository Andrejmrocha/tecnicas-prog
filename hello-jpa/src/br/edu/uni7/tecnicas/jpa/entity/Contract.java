package br.edu.uni7.tecnicas.jpa.entity;

import jakarta.persistence.Entity;

@Entity
public class Contract extends Document{
	private String terms;

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}
	
	
}
