package com.course.dto;

import java.math.BigDecimal;

public class ProductDto {

	private Long id;
	
	private String code;
	
	private String name;
	
	private BigDecimal listPrice;
	
	private BigDecimal salesPrice;
	
	private String memo;
	
	private String cname;

	public ProductDto() {

	}

	public ProductDto(Long id, String code, String name, BigDecimal listPrice, BigDecimal salesPrice, String memo) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.listPrice = listPrice;
		this.salesPrice = salesPrice;
		this.memo = memo;
	}
	
	public ProductDto(String code, String name, BigDecimal listPrice, BigDecimal salesPrice, String memo) {
		super();
		this.code = code;
		this.name = name;
		this.listPrice = listPrice;
		this.salesPrice = salesPrice;
		this.memo = memo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
