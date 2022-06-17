package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Name is required!")
	@Size(min=8,max=255,message="Name must be between 8-255 characters." )
	private String name;
	
	public Expense()
	{
		
	}
	
	@NotNull(message="Please enter a valid vendor")
	@Size(min=8,max=255,message="Vendor must be between 8-255 characters." )
	private String vendor;
	
	@NotNull(message="Please enter a price")
	@DecimalMin(value="0.1", message="You need to set a price")
	@DecimalMax(value="9999.00", message="Thats the maximum amount you can enter")
	private Double price;
	
	@NotNull(message="Please enter a description")
	@Size(min=8,max=255,message="Description must be between 8-255 characters." )
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
