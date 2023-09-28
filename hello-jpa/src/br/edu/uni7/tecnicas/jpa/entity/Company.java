package br.edu.uni7.tecnicas.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double revenue;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy = "publisher")
	private List<Magazine> mags = new ArrayList<Magazine>();
	
	public Company(Long id, String name, double revenue) {
		this.id = id;
		this.name = name;
		this.revenue = revenue;
	}
	
	public Company() {
	}
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
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public List<Magazine> getMags() {
		return mags;
	}

	public void setMags(List<Magazine> mags) {
		this.mags = mags;
	}
	
	
}
