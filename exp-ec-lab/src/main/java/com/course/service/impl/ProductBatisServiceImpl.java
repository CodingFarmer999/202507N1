package com.course.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.dto.ProductDto;
import com.course.entity.ProductEntity;
import com.course.mapper.ProductMapper;
import com.course.service.ProductService;
import com.course.vo.ProductQueryParam;
import com.course.vo.ProductVo;

@Service
public class ProductBatisServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public void addProductForEach(ProductVo vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProduct(ProductVo vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductEntity> getAllProductReturnEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductVo> getAllProduct() {
		List<ProductDto> dtos = productMapper.findAll();
		return dtos.stream().map(dto -> {
			ProductVo vo = new ProductVo();
			vo.setCode(dto.getCode());
			vo.setName(dto.getName());
			return vo;
		}).collect(Collectors.toList());
	}

	@Override
	public List<ProductVo> getAllProductForPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductVo getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDto> getAllProductData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDto> getProductByCondition(ProductQueryParam queryParam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductVo> getAllProductQuery() {
		// TODO Auto-generated method stub
		return null;
	}

}
