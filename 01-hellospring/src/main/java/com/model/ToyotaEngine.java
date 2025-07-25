package com.model;

import org.springframework.stereotype.Component;

@Component
public class ToyotaEngine implements Engine {

	public void start() {
		System.out.println("ToyotaEngine 啟動");
	}
}
