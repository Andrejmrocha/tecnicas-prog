package br.edu.uni7.tecnicas.jpa.entity;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Calendar startDate;
	private double payment;
	
		
	@OneToMany
	private List<LineItem> items;
	
	public Subscription(Long id, Calendar startDate, double payment) {
		this.id = id;
		this.startDate = startDate;
		this.payment = payment;
	}
	public Subscription() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "id: " + id + ", startDate: " + startDate + ", payment: " + payment + ", items: " + items
				+ "]";
	}
	
	
	
	
	
}
