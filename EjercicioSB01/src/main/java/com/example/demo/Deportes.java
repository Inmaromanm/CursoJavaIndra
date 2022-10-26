package com.example.demo;

public class Deportes {
	
	private String deportes;
	
	public Deportes() {
		this.deportes = "Selección española\r\n"
				+ "Dani Olmo y su lesión: \"Me llegó a preocupar no poder estar para el Mundial\"";
	}

	@Override
	public String toString() {
		return "Deportes: " + deportes;
	}

	
}
