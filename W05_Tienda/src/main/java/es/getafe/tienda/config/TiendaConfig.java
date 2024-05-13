package es.getafe.tienda.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"es.getafe.tienda.negocio", "es.getafe.tienda.vista"})
@EnableJpaRepositories("es.getafe.tienda.persistencia")
public class TiendaConfig {
	
}
