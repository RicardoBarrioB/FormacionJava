package es.cursogetafe.springxml.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"es.cursogetafe.springxml.persistencia","es.cursogetafe.springxml.negocio"})
@Import({DesarrolloConfig.class, ProduccionConfig.class})
@PropertySource("classpath:app.properties")
public class AppConfig {
	
}
