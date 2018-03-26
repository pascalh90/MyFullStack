package com.pascal.demo_fullstack.repository;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pascal.demo_fullstack.model.Product;

@Component
public class DatabaseLoader implements CommandLineRunner {
	
	private final ProductRepository repository;

	@Autowired
	public DatabaseLoader(ProductRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Product("Pen", "PC1", LocalDate.of(1990, Month.JULY, 29), 10.90f, "Blue pen", 3f, null));
		this.repository.save(new Product("Fridge", "PC2", LocalDate.of(2005, Month.APRIL, 10), 500.39f, "Cold fridge", 4.5f, null));

	}
}
