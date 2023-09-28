package br.edu.uni7.tecnicas.jpa;

import java.util.GregorianCalendar;
import java.util.List;

import br.edu.uni7.tecnicas.jpa.entity.Author;
import br.edu.uni7.tecnicas.jpa.entity.Subscription;
import br.edu.uni7.tecnicas.jpa.persistence.AuthorRepository;
import br.edu.uni7.tecnicas.jpa.persistence.SubscriptionRepository;

public class Main {
	public static void main(String[] args) {
		SubscriptionRepository subscriptionRepository = new SubscriptionRepository();
		AuthorRepository authorRepository = new AuthorRepository();
		
		Author author = new Author(null, "Andre", "Rocha");
		
		List<Subscription> s = subscriptionRepository.findByPaymentLowerThan(15.0);
		
		System.out.println(s.get(1).getPayment());
		
	}

}
