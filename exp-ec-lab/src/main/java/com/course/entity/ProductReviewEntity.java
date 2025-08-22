package com.course.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCT_REVIEW")
public class ProductReviewEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_REVIEW_SEQ_GENERATOR")
	@SequenceGenerator(name = "PRODUCT_REVIEW_SEQ_GENERATOR", sequenceName = "PRODUCT_REVIEW_SEQ", allocationSize = 1)
	private Long id;
	
	@Column
	private String memo;
	
	@Column
	private Long productId;
}
