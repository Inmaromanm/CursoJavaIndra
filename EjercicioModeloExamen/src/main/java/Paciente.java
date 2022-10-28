import java.time.LocalDate;
import java.time.Period;

public class Paciente extends Persona implements Interfaz_esperanza{
	
	private int id;
	private String enfermedad;
	private String medicina;
	private int valorMedicina;
	private String seguroMedico;
	
	public Paciente() {
		
	}

	public Paciente(String nombre, LocalDate fechaNac,int id, String enfermedad, String medicina, int valorMedicina, String seguroMedico) {
		super(nombre, fechaNac);
		this.id = generaId();
		this.enfermedad = enfermedad;
		this.medicina = medicina;
		this.valorMedicina = valorMedicina;
		this.seguroMedico = seguroMedico;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getMedicina() {
		return medicina;
	}

	public void setMedicina(String medicina) {
		this.medicina = medicina;
	}

	public int getValorMedicina() {
		return valorMedicina;
	}

	public void setValorMedicina(int valorMedicina) {
		this.valorMedicina = valorMedicina;
	}

	public String getSeguroMedico() {
		return seguroMedico;
	}

	public void setSeguroMedico(String seguroMedico) {
		this.seguroMedico = seguroMedico;
	}
	
	public int generaId() {
		int id = (int)(Math.random()*10+1);
		return id;
	}

	

	@Override
	public String calcularEsperanza() {
		String esperanza = "";
		
		if(calcularEdad() >= 30) {
			esperanza = "Esperanza de vida media";
		}else if(calcularEdad() < 30 && enfermedad.equals("Rosacea")) {
			esperanza = "Esperanza de vida media";
		}else if(calcularEdad()>= 30 && enfermedad.equals("Alergia")) {
			esperanza= "Esperanza de vida baja";
		}else {
			esperanza = "Espezanda de vida alta";
		}
		
		return esperanza;
	}
	
	public String calcularRecargo() {
		String recargo="";
		
		if(getSeguroMedico().equals("No Posee")) {
			recargo =" No cobrar recargo";
		}else if(getSeguroMedico().equals("Swiss Medical")) {
			int valor = (getValorMedicina()*5)/100;
			recargo = " Cobrar un recargo del 5%, total "+ valor;
		}else if(getSeguroMedico().equals("Assist Card")) {
			int valor = (getValorMedicina()*10)/100;
			recargo = " Cobrar un 10% de recargo, total "+ valor;
		}
		
		
		return recargo;
	}
	
	
	@Override
	public String toString() {
		return "Paciente "+ getNombre()+ " con id " +id+" con fecha de nacimiento "+getFechaNac()+
				" tiene "+ calcularEdad()+ " años y tiene "+ enfermedad+
				", medicina " + medicina + "tiene una " + calcularEsperanza()+
				", valorMedicina " + valorMedicina+ ", seguroMedico " + seguroMedico+ " recargo "+
				calcularRecargo();
	}

}
