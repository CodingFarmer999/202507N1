package com.course.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.course.dto.ProductDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class ProductCustomRepository {

	// @Autowired
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<ProductDto> findAllProduct() {
		// SQL
		// Product 
		// JOIN ProductPrice
		// JOIN 其他
		String sql = """
				SELECT
				P.ID,
				P.CODE,
				P.NAME,
				R.LIST_PRICE,
				R.SALES_PRICE,
				V.MEMO 
				FROM PRODUCT P
				JOIN PRODUCT_PRICE R ON R.PRODUCT_ID = P.ID
				LEFT JOIN PRODUCT_REVIEW V ON V.PRODUCT_ID = P.ID
			""";
		
		// Query query = entityManager.createNativeQuery(sql, ProductDto.class);
		
		// ProductDtoMapping
		Query query = entityManager.createNativeQuery(sql, "ProductDtoMapping");
		return query.getResultList();
	}
}
