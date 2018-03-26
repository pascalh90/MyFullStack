package com.pascal.demo_fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pascal.demo_fullstack.model.Product;
import com.pascal.demo_fullstack.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	/* (non-Javadoc)
	 * @see com.pascal.demo_fullstack.service.ProductService#save(com.pascal.demo_fullstack.model.Product)
	 */
	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	/* (non-Javadoc)
	 * @see com.pascal.demo_fullstack.service.ProductService#getAllProducts()
	 */
	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.pascal.demo_fullstack.service.ProductService#deleteById(java.lang.Long)
	 */
	@Override
	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.pascal.demo_fullstack.service.ProductService#getProductNameById(java.lang.Long)
	 */
	@Override
	public String getProductNameById(Long id) {
		return productRepository.findById(id).get().getProductName();
	}
	
}
