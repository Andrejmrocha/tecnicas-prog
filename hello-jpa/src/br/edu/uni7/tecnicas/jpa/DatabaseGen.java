package br.edu.uni7.tecnicas.jpa;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;

import br.edu.uni7.tecnicas.jpa.entity.Book;
import br.edu.uni7.tecnicas.jpa.entity.User;
import br.edu.uni7.tecnicas.jpa.entity.Vehicle;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DatabaseGen {
	public static void main(String[] args) {
		Properties config = new Properties();
		config.put("hibernate.hbm2ddl.auto", "create");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni7-pu", config);
		EntityManager em = factory.createEntityManager();
		
		User usuario1 = new User(null, "nome1", "sobrenome1", "password");
		User usuario2 = new User(null, "nome2", "sobrenome2", "password");
		User usuario3 = new User(null, "nome3", "sobrenome3", "password");
		
//		Book book1 = new Book(null, "livro1" , "description1", "1234", new GregorianCalendar());
//		Book book2 = new Book(null, "livro2" , "description2", "5678", new GregorianCalendar());
//		Book book3 = new Book(null, "livro3" , "description3", "0000", new GregorianCalendar());
//		
//		usuario1.getBooks().add(book1);
//		book1.getAuthors().add(usuario1);
//		usuario1.getBooks().add(book2);
//		book2.getAuthors().add(usuario1);
//		
//		usuario2.getBooks().add(book2);
//		book2.getAuthors().add(usuario2);
//		usuario2.getBooks().add(book3);
//		book3.getAuthors().add(usuario2);
//		
//		usuario3.getBooks().add(book1);
//		book1.getAuthors().add(usuario3);
//		usuario3.getBooks().add(book2);
//		book2.getAuthors().add(usuario3);
//		usuario3.getBooks().add(book3);
//		book3.getAuthors().add(usuario3);
//		
		em.getTransaction().begin();
		

		em.getTransaction().commit();
		

		em.close();
		factory.close();
	}
}