package com.model;

public class Toyota /** extends ToyotaEngine */ {

	private ToyotaEngine engine;
	
	public Toyota(ToyotaEngine engine) {
		this.engine = engine;
	}
	
	public void move() {
		// ToyotaEngine engine = new ToyotaEngine();
		// engine.start();
		engine.start();
		System.out.println("Toyota 移動");
	}
}
