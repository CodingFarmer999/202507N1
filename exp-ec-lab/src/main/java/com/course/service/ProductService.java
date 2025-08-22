package com.course.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.dto.ProductDto;
import com.course.entity.ProductEntity;
import com.course.entity.ProductPriceEntity;
import com.course.repository.ProductPriceRepository;
import com.course.repository.ProductRepository;
import com.course.vo.ProductQueryParam;
import com.course.vo.ProductVo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductPriceRepository productPriceRepository;
	
	/**
	 * 新增商品
	 * @param vo
	 */
	public void addProduct(ProductVo vo) {

		// 新增 Product 資料
		ProductEntity productEntity = new ProductEntity();
		productEntity.setCode(vo.getCode());
		productEntity.setName(vo.getName());
		productRepository.save(productEntity);
		
		// 新增 ProductPrice 資料
		
	}
	
	/**
	 * 取得所有商品
	 * @return
	 */
	public List<ProductVo> getAllProduct() {
		// 取得所有商品
		List<ProductEntity> productList = productRepository.findAll();
		
		return productList.stream().map(product -> {
			ProductVo vo = new ProductVo();
			// 取得 Entity 欄位資料，並放到 Vo 當中

			vo.setCode(product.getCode());
			vo.setName(product.getName());
			// 取得 Price 資料
			ProductPriceEntity priceEntity = product.getPriceEntity();
			vo.setListPrice(priceEntity.getListPrice());
			vo.setSalesPrice(priceEntity.getSalesPrice());
			return vo;
		}).collect(Collectors.toList());
	}
	
	/**
	 * 取得所有商品
	 * @return
	 */
	public List<ProductVo> getAllProductForPrice() {
		// 取得所有商品
		List<ProductPriceEntity> productPriceList = productPriceRepository.findAll();
		
		return productPriceList.stream().map(price -> {
			ProductVo vo = new ProductVo();
			// 取得 Entity 欄位資料，並放到 Vo 當中

			vo.setCode(price.getProduct().getCode());
			vo.setName(price.getProduct().getName());
			// 取得 Price 資料
			vo.setListPrice(price.getListPrice());
			vo.setSalesPrice(price.getSalesPrice());
			return vo;
		}).collect(Collectors.toList());
	}
	
	/**
	 * 透過ID取得商品
	 * @return
	 */
	public ProductVo getProductById(Long id) {
		// 取得所有商品
		ProductEntity product = null;
		ProductVo vo = new ProductVo();
		// 取得 Price 資料
		
		// 取得 多筆 Review 資料

		
		// 取得 多筆 Category 資料

		return vo;
	}
	
	/**
	 * 取得所有商品，使用EntityManager
	 * @return
	 */
	public List<ProductDto> getAllProductData() {
		return null;
	}
	
	/**
	 * 取得所有商品，使用EntityManager
	 * @return
	 */
	public List<ProductDto> getProductByCondition(ProductQueryParam queryParam) {
		return null;
	}
	
}
