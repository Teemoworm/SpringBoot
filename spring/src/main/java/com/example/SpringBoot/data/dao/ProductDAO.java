package com.example.SpringBoot.data.dao;

import com.example.SpringBoot.data_Entity.ProductEntity;

public interface ProductDAO {

	ProductEntity saveProduct(ProductEntity productEntity);//저장
	
	ProductEntity getProduct(String productId);//불러오기
}
