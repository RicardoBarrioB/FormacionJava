package agenda.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import javax.sql.DataSource;

import agenda.config.Config;
import agenda.excepciones.ContactoPersistenceException;
import agenda.modelo.Contacto;

public class ContactoDaoJDBC implements ContactoDao {
	
	private DataSource ds;
	
	public ContactoDaoJDBC() {
		ds = Config.getDataSource();
	}

	@Override
	public void insertar(Contacto c) {
		
		String sql = "insert into contactos Values(null,?,?,?,?,?,?,?,?,?,?,?)";
				
		try(Connection cx = ds.getConnection()){
			PreparedStatement ps = cx.prepareStatement(sql);
			ps.setString(1,c.getNombre());
			ps.setString(2,c.getApellidos());
			ps.setString(3,c.getApodo());
			ps.setString(4,c.getDom().getTipoVia());
			ps.setString(5,c.getDom().getVia());
			ps.setInt(6,c.getDom().getNumero());
			ps.setInt(7,c.getDom().getPiso());
			ps.setString(8,c.getDom().getPuerta());
			ps.setString(9,c.getDom().getCodigoPostal());
			ps.setString(10,c.getDom().getCiudad());
			ps.setString(11,c.getDom().getProvincia());
			
			//faltan los telefonos
			
			ps.executeUpdate();

			
		} catch (SQLException e) {
			// Hacer un log fecha, hora, usuario, tipo de error
			e.printStackTrace();
			throw new ContactoPersistenceException();
		}
		
	}

	@Override
	public void actualizar(Contacto c) {
		ContactoDaoJDBC prueba = new ContactoDaoJDBC();
		prueba.insertar(c);
		
	}

	@Override
	public boolean eliminar(int idContacto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Contacto c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contacto buscar(int idContacto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Contacto> buscar(String cadena) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Contacto> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
