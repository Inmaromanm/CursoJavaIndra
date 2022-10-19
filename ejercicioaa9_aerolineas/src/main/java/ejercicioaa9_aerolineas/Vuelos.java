package ejercicioaa9_aerolineas;

import java.util.List;

public class Vuelos implements interfaz_vuelo{
	
	private String  destino;
	private int billetes;
	private String cuando;
	
	public Vuelos() {
		super();
	}
	public Vuelos(String destino, int billetes, String cuando) {
		super();
		this.destino = destino;
		this.billetes = billetes;
		this.cuando = cuando;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getBilletes() {
		return billetes;
	}
	public void setBilletes(int billetes) {
		this.billetes = billetes;
	}
	public String getCuando() {
		return cuando;
	}
	public void setCuando(String cuando) {
		this.cuando = cuando;
	}
	@Override
	public String toString() {
		return "Vuelo " +destino + ", Billetes vendidos=" + billetes + ", cuando=" + cuando;
	}
	public int ganancia_Neta() {
		//Ganancia neta = Cantidad de pasajes vendidos * 50 (50 euros, valor promedio del pasaje)		
		 return this.billetes * 50;	
		 
		
	}
	public int pasajeros_vuelo() {
		//Cantidad de pasajeros que asistieron al vuelo = Cantidad de pasajes vendidos / 2 
		return this.billetes / 2;

		
	}
	public int ganancia_total(List<Integer> ganancias) {
		//Ganancia TOTAL = Suma de la ganancia NETA
		int total=0;
		for(int i=0; i<ganancias.size(); i++) {
			total = total + ganancias.get(i);
		}
		return total;
		
	}
	
	

}
