package es.cursogetafe.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursogetafe.springxml.config.AppConfig;
import es.cursogetafe.springxml.negocio.Negocio1;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Perfil actual: " + System.getProperty("spring.profiles.active"));
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Negocio1 neg = ctx.getBean("neg", Negocio1.class);
		
		neg.metodoNegocio();
	}

}
