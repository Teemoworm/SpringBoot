package com.example.SpringBoot.data_Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity//DB에 연결해줌
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")//테이블 생성
public class ProductEntity {
	
	@Id //기본키 (primary key 생성)
	String productId;
	String productName;
	Integer productPrice;
	Integer productStock;
	

}
