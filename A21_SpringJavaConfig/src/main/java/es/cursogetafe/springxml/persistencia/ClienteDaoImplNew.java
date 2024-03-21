package es.cursogetafe.springxml.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component("cDaoNew") -- Component es el generico
@Repository("cDaoNew") //-- estereotipo de component
public class ClienteDaoImplNew implements ClienteDao {

	@Autowired
	private DataSource ds;
	
	public ClienteDaoImplNew() {
		System.out.println("Constructor de ClienteDaoImplNew");
	}

	@Override
	public void metodoDao() {
		System.out.println("metodoDao de ClienteDaoImplNew");
		try(Connection cx = ds.getConnection()){
			String sql = "select nombre from alumnos";
			PreparedStatement ps = cx.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("nombre"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
