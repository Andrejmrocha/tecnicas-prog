package br.edu.uni7.tecnicas.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class LineItem extends Contract{
	private String comments;
	private double price;
	
	@OneToOne
	private Magazine magazine;
	
	
	public LineItem(String comments, double price) {
		this.comments = comments;
		this.price = price;
		
	}
	
	public LineItem() {
	}
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Magazine getMagazine() {
		return magazine;
	}

	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}

	
}
