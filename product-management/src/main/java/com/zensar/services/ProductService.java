package com.zensar.services;

import java.util.List;

import com.zensar.dto.ProductDTO;
import com.zensar.entity.Product;

public interface  ProductService {
	
	public ProductDTO  insertProduct(ProductDTO product);
	
	public List<Product>  getProducts();

}
