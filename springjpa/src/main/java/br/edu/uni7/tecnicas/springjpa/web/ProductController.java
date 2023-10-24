package br.edu.uni7.tecnicas.springjpa.web;

import br.edu.uni7.tecnicas.springjpa.entity.Product;
import br.edu.uni7.tecnicas.springjpa.persistence.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product save(String name, String description, Double price){
        Product product = new Product(null, name, description, price);
        repository.save(product);

        return product;
    }

    @GetMapping
    public List<Product> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{name}")
    public Product findByName(@PathVariable String name){
        Product product = null;
        Optional<Product> optional = repository.findByName(name);
        if (optional.isPresent()){
            product = optional.get();
        }
        return product;
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Integer id){
        Product product = null;
        Optional<Product> optional = repository.findById(id);
        if (optional.isPresent()){
            product = optional.get();
        }
        return product;
    }

    @DeleteMapping("/{id}")
    public Product remove(@PathVariable Integer id){
        Product product = null;
        Optional<Product> optional = repository.findById(id);

        if(optional.isPresent()){
            product = optional.get();
            repository.delete(product);
        }
        return product;
    }
}
