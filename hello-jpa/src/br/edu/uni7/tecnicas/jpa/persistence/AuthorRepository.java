package br.edu.uni7.tecnicas.jpa.persistence;

import java.util.List;

import br.edu.uni7.tecnicas.jpa.entity.Author;
import br.edu.uni7.tecnicas.jpa.entity.Subscription;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class AuthorRepository {
	private EntityManagerFactory factory;
	
	public AuthorRepository() {
		this.factory = Persistence.createEntityManagerFactory("uni7-pu");
	}
	
	public Author create(Author author) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(author);
		
		em.getTransaction().commit();
		
		em.close();
		
		return author;
		
	}
	
	public Author findById(Long id) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = em.find(Author.class, id);
		
		em.getTransaction().commit();
		
		em.close();
		
		return author;
	}
	
	public List<Author> findAll(){
		
		EntityManager em = factory.createEntityManager();
		TypedQuery<Author> query = em.createQuery("select a from Author a", Author.class);
		
		List<Author> authors = query.getResultList();
		
		em.close(); 
		
		return authors;
	}
	
	
	public List<Author> findByLastName(String lastName){
		EntityManager em = factory.createEntityManager();
		
		TypedQuery<Author> query = em.createQuery("select s from Subscription s where s.", Author.class);
		List<Author> authors = query.getResultList();
		
		return authors;
	}
	
	public void update(Author authorUpdated) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = em.find(Author.class, authorUpdated.getId());
		if(author != null) {
			author.setFirstName(authorUpdated.getFirstName());
			author.setLastName(authorUpdated.getLastName());
			em.merge(author);
		}
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	public void delete(Long id) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = em.find(Author.class, id);
		if(author != null) {
			em.remove(author);
		}
		
		
	}
	

}
