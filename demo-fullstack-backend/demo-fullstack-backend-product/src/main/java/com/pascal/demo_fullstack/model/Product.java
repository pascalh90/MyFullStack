package com.pascal.demo_fullstack.model;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@ApiModel
public class Product {
	@ApiModelProperty(notes = "The database generated product ID")
	private @Id @GeneratedValue Long productId;
	@ApiModelProperty(notes = "Product name")
	private String productName;
	@ApiModelProperty(notes = "Product code")
	private String productCode;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@ApiModelProperty(notes = "Release date")
	private LocalDate releaseDate;
	@ApiModelProperty(notes = "Price")
	private float price;
	@ApiModelProperty(notes = "Product description")
	private String description;
	@ApiModelProperty(notes = "Product rating")
	private float starRating;
	@ApiModelProperty(notes = "Product image url")
	private String imageUrl;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private Product() {}
	
	public Product(String productName, String productCode, LocalDate releaseDate, float price,
			String description, float starRating, String imageUrl) {
		this.productName = productName;
		this.productCode = productCode;
		this.releaseDate = releaseDate;
		this.price = price;
		this.description = description;
		this.starRating = starRating;
		this.imageUrl = imageUrl;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long id) {
		this.productId = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String name) {
		this.productName = name;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getStarRating() {
		return starRating;
	}

	public void setStarRating(float starRating) {
		this.starRating = starRating;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
