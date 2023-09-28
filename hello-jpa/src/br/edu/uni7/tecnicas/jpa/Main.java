package br.edu.uni7.tecnicas.jpa;

import java.util.GregorianCalendar;

import br.edu.uni7.tecnicas.jpa.entity.Subscription;
import br.edu.uni7.tecnicas.jpa.persistence.SubscriptionRepository;

public class Main {
	public static void main(String[] args) {
		SubscriptionRepository subscriptionRepository = new SubscriptionRepository();
		
		Subscription s1 = new Subscription(null, new GregorianCalendar(), 10.0);
		Subscription s2;
		s1 = subscriptionRepository.create(s1);
	}

}
