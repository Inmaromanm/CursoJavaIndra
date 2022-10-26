package com.example.demo;

public class Economia {
	
	private String economia;
	
	public Economia() {
		this.economia = "ENERGÍA\r\n"
				+ "Iberdrola dispara su beneficio un 29% pese a aumentar provisiones por la inflación";
	}

	@Override
	public String toString() {
		return "Economia: " + economia;
	}
	
	

}
