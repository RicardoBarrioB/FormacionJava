package agenda.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"agenda.modelo", "agenda.negocio", "agenda.persistencia","agenda.vista", "agenda.vista.swing"})
public class Config {

	@Bean
	public EntityManagerFactory getEMF() {
		return Persistence.createEntityManagerFactory("agenda");
	}

}
