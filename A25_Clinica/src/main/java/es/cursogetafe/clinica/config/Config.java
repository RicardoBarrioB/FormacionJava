package es.cursogetafe.clinica.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"es.cursogetafe.clinica.persistencia"})
public class Config {

	@Bean
	public EntityManagerFactory getEMF() {
		return Persistence.createEntityManagerFactory("clinica");
	}

}
