package com.model;

public class Toyota /** extends ToyotaEngine */ {

	private Integer price;
	
	// private ToyotaEngine engine;
	private Engine engine;
	
	public Toyota() {
	}
	
	public Toyota(Integer price, Engine engine) {
		this.price = price;
		this.engine = engine;
	}

	public Toyota(Engine engine) {
		this.engine = engine;
	}
	
	public void move() {
		// ToyotaEngine engine = new ToyotaEngine();
		// engine.start();
		engine.start();
		System.out.println("Toyota 移動");
	}

	@Override
	public String toString() {
		return "Toyota [price=" + price + ", engine=" + engine + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
