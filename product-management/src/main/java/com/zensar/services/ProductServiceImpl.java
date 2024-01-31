package com.zensar.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.ProductDTO;
import com.zensar.entity.Product;
import com.zensar.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public ProductDTO insertProduct(ProductDTO product) { // 20

		// TODO Auto-generated method stub

		// Product productEntity = mapToEntity(product);

		Product productEntity = mapper.map(product, Product.class);
		Product savedProduct = productRepository.save(productEntity);

		// ProductDTO productDTO = mapTODTO(savedProduct);

		return mapper.map(savedProduct, ProductDTO.class);
	}

	@Override
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

	// 10

	/*
	 * private Product mapToEntity(ProductDTO product) {
	 * 
	 * Product productEntity = new Product();
	 * productEntity.setProductName(product.getProductName());
	 * productEntity.setProductCost(product.getProductCost());
	 * 
	 * return productEntity;
	 * 
	 * }
	 * 
	 * private ProductDTO mapTODTO(Product product) {
	 * 
	 * ProductDTO productDTO = new ProductDTO();
	 * productDTO.setProductId(product.getProductId());
	 * productDTO.setProductName(product.getProductName());
	 * productDTO.setProductCost(product.getProductCost());
	 * 
	 * return productDTO; }
	 */

}
