package com.zensar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int productId;

	@Column(name = "name")
	private String productName;

	@Column(name = "cost")
	private double productCost;

}
