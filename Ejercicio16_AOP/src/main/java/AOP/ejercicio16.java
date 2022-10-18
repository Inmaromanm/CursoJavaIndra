package AOP;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Ejercicio AA1:
	Desarrollar una aplicación que implemente el paradigma de programación orientada a aspectos. El programa debe
	poder informar ANTES de que se realice la accion, la fecha en la cual se realizo, el formato de la fecha 
	debe ser AA/MM/DD Horas Minutos Segundos 
	¿Que debe hacer el programa?
	El programa debe informar el estado del tiempo para la ciudad de Barcelona. Y antes de informarse se debe
	ejecutar el mensaje de la hora de ejecución a traves de AOP. 
	ENTREGABLES:
	- Link del repositorio a Github
	- Captura de pantalla. 

 */
public class ejercicio16 {

	public static void main(String[] args) throws IOException {
		
		AnnotationConfigApplicationContext acA = new AnnotationConfigApplicationContext(configurador_AOP.class);
		Servicio serv = acA.getBean(Servicio.class);
		serv.operacion();

	}

}
