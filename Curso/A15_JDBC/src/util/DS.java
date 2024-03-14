package util;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DS {
	
	private static DataSource ds;
	
	private DS() {
		
	}
	
	public static DataSource getDataSource() { //tambien podria llamarse getInstance
		if(ds == null) {
			BasicDataSource bds = new BasicDataSource();
			bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			bds.setUrl("jdbc:mysql://localhost/04_tienda");
			bds.setUsername("root");
			bds.setPassword("root");
			ds = bds;
		}
		return ds;
	}
	
}
