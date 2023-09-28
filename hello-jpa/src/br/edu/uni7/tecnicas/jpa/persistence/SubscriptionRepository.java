package br.edu.uni7.tecnicas.jpa.persistence;

import java.util.ArrayList;
import java.util.List;

import br.edu.uni7.tecnicas.jpa.entity.Subscription;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class SubscriptionRepository {
	private EntityManagerFactory factory;
	
	public SubscriptionRepository() {
		this.factory = Persistence.createEntityManagerFactory("uni7-pu");
	}
	
	public Subscription create(Subscription subscription) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(subscription);
		
		em.getTransaction().commit();
		
		em.close();
		
		return subscription;
		
	}
	
	public Subscription findById(Long id) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Subscription s1 = em.find(Subscription.class, id);
		
		em.getTransaction().commit();
		
		em.close();
		
		return s1;
	}
	
	public List<Subscription> findAll(){
		
		EntityManager em = factory.createEntityManager();
		
		
		TypedQuery<Subscription> query = em.createQuery("select s from Subscription s", Subscription.class);
		List<Subscription> subscriptions = query.getResultList();
		
		
		return subscriptions;
	}
	
	public Subscription delete(Long id) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Subscription s1 = em.find(Subscription.class, id);
		if(s1 != null) {
			em.remove(s1);
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return s1;
	}
	
	public Subscription update(Subscription subscription) {
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Subscription s1 = em.find(Subscription.class, subscription.getId());
		if(s1 != null) {
			s1.setPayment(subscription.getPayment());
			s1.setStartDate(subscription.getStartDate());
			em.merge(s1);
		}
	
		em.getTransaction().commit();
		
		em.close();
		
		return s1;
	}

}
