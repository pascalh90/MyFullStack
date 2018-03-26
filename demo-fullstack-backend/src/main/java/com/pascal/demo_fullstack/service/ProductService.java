package com.pascal.demo_fullstack.service;

import java.util.List;

import com.pascal.demo_fullstack.model.Product;

public interface ProductService {

	public Product save(Product product);

	public List<Product> getAllProducts();

	public void deleteById(Long id);

	public String getProductNameById(Long id);

}