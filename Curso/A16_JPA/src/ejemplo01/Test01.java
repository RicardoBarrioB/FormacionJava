package ejemplo01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
		EntityManagerFactory emf = EMF.getInstance();
		EntityManager em = emf.createEntityManager();
		
		Persona01 p = em.find(Persona01.class, 11);
		if (p != null) {
			System.out.println(p);
		}
		
//		String sql = "select idPersona, nombre, apellidos, apodo, dni from persona where idPersona = ?";
//		PreparedStatement ps = cs.prepareStatement(sql);
//		ResultSet rs = ps.executeQuery();
//		if(rs.next()) {
//			Persona01 per = new Persona01();
//			per.setIdPersona(rs.getInt("idPersona"));
//			per.setNombre(rs.getString("nombre"));
//			...
//		}
		
		em.close();
		emf.close();
	}
}
