package br.edu.uni7.tecnicas.springjpa.persistence;

import br.edu.uni7.tecnicas.springjpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByName(String name);
}
