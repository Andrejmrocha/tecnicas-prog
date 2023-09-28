package br.edu.uni7.tecnicas.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Magazine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String isbn;
	private String title;
	private double price;
	private int copiesSold;
	
	@OneToOne
	private Article coverArticle;
	
	@OneToMany
	private List<Article> articles = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "publisher_id", referencedColumnName = "id")
	private Company publisher;
	
	public Magazine(String isbn, String title, double price, int copiesSold) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.copiesSold = copiesSold;
	}
	
	public Magazine() {
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	public Article getCoverArticle() {
		return coverArticle;
	}

	public void setCoverArticle(Article coverArticle) {
		this.coverArticle = coverArticle;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
	
	
}
