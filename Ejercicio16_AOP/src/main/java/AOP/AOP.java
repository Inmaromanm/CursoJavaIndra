package AOP;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOP {

	@Before("execution(* operacion())")
		public void log() {
			System.out.println("Información");
		}
	
	@After("execution(* operacion())")
	public void mensajePosterior() {
		System.out.println("Ya se ejecutó la acción");
	}
	
	
}
