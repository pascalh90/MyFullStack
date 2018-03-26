package com.pascal.demo_fullstack.repository;

import org.springframework.data.repository.CrudRepository;

import com.pascal.demo_fullstack.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}