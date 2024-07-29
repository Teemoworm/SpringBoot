package com.example.SpringBoot.data_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.data_Entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
