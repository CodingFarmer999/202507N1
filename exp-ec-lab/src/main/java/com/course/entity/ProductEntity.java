package com.course.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PRODUCT")
@Data
public class ProductEntity {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	
	private String name;
	
	// 與 Product Price 的關聯 OneToOne
	
	
	// 與 Product Review 的關聯(一個商品可以有多個評論) OneToMany
	
	
	// 與 Product Category 的關聯(一個商品可以有多個分類、一個分類也會有多個商品) ManyToMany
	// iPhone -> 3C, 手機 , 3C -> iPhone, 平板
}
