package com.pascal.demo_fullstack.controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pascal.demo_fullstack.model.Product;
import com.pascal.demo_fullstack.service.ProductService;

import io.swagger.annotations.ApiOperation;


@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@ApiOperation(value = "getProductName", notes = "getProductName", response = String.class)
	@RequestMapping(value = "/product/getName", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public String getProductName(@RequestParam(value="id") Long id) {
		return productService.getProductNameById(id);
	}
	
	@ApiOperation(value = "getAll", notes = "getAll", response = String.class)
	@RequestMapping(value = "/product/getAll", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public  List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@ApiOperation(value = "addProduct", notes = "addProduct", response = String.class)
	@RequestMapping(value = "/product/add", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	@ResponseBody
	public Product addProduct(String productName, String productCode, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate releaseDate, float price,
			String description, float starRating, String imageUrl) {
		return productService.save(new Product(productName,productCode,releaseDate,price,description,starRating,imageUrl));
	}	

	@ApiOperation(value = "deleteProduct", notes = "deleteProduct", response = String.class)
	@RequestMapping(value = "/product/delete", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProduct(@RequestParam(value="id") Long id) {
		productService.deleteById(id);
	}	
}
