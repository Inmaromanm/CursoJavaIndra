package com.example.demo;

public class Clima {
	
	public String tiempo;

	public Clima() {
		
	}
	
	public Clima(String tiempo) {
		super();
		this.tiempo = tiempo;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Clima: " + tiempo;
	}
	
	
	
	

}
