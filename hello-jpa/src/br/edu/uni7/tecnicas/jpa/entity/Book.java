package br.edu.uni7.tecnicas.jpa.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "livro")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer id;
	
	@Column(name = "titulo", nullable = false)
	private String title;
	
	@Column(name = "descricao", nullable = false)
	private String description;
	
	@Column(name = "isbn", nullable = false, unique = true)
	private String isbn;
	
	@Column(name = "data_publicacao", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar publishDate;
	
	@ManyToMany(mappedBy = "books")
	private List<User> authors = new ArrayList<>();
	
	public Book() {}
	
	public Book(Integer id, String title, String description, 
			String isbn, Calendar publishDate) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.isbn = isbn;
		this.publishDate = publishDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	public Calendar getPublishDate() {
		return publishDate;
	}

	
	public void setPublishDate(Calendar publishDate) {
		this.publishDate = publishDate;
	}

	public List<User> getAuthors() {
		return authors;
	}

	public void setAuthors(List<User> authors) {
		this.authors = authors;
	}
	
}
