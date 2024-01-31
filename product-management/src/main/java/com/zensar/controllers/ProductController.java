package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.ProductDTO;
import com.zensar.entity.Product;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;  // Interface based programming
	
	// http://localhost:8080/products/  ---> POST 
	@PostMapping("/")
	public ResponseEntity<ProductDTO>  insertProduct(@RequestBody ProductDTO product) {
		 return new ResponseEntity<ProductDTO>(productService.insertProduct(product), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	

}
