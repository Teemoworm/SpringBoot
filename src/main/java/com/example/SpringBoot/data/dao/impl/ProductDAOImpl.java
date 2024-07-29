package com.example.SpringBoot.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.data.dao.ProductDAO;
import com.example.SpringBoot.data_Entity.ProductEntity;
import com.example.SpringBoot.data_repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO {
	
	
	private ProductRepository productRepository;
	
	@Autowired
	public ProductDAOImpl(ProductRepository productRepository) {//생성자
		this.productRepository = productRepository;
	}

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);
		return productEntity;
	}

	@Override
	public ProductEntity getProduct(String productId) {
		ProductEntity productEntity = productRepository.getReferenceById(productId);
		return productEntity;
	}
	
	
}
