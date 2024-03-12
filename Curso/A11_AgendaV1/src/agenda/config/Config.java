package agenda.config;

import java.io.FileReader;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class Config {
	private static DataSource ds;
	private static Properties prop;
	
	private Config() {};
	
	public static DataSource getDataSource() {
		if(ds == null) {
			BasicDataSource bds = new BasicDataSource();
			bds.setDriverClassName(getPro().getProperty("bbdd.driver"));
			bds.setUrl(getPro().getProperty("bbdd.url"));
			bds.setUsername(getPro().getProperty("bbdd.user"));
			bds.setPassword(getPro().getProperty("bbdd.pass"));
			ds = bds;
		}
		
		return ds;
	}
	
	public static Properties getPro() {
		if(prop == null) {
			prop = new Properties();
			try (FileReader fr = new FileReader("agenda.properties")) {
				prop.load(fr);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("Problema con el fichero properties");
			}
		}
		return prop;
	}
}
