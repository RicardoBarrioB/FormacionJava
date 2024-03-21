package agenda.tests;

import agenda.modelo.Contacto;

public class Test01 {
	public static void main(String[] args) {
		Contacto c = new Contacto("Pedro", "Ramirez", "Peter");
		c.setIdContacto(148);
		System.out.println(c.getApodo());
		
//		String[] telefonos = {"621123456", "621145456", "665423456"};
//		c.setTelefonos(telefonos);
//		c.setTelefonos("621123456");
		
		c.addTelefono("123");
		c.addTelefono("234");
		String[] telefonos = c.getTelefonos();
		for(int i = 0; i < telefonos.length; i++) {
			System.out.println(telefonos[i]);
		}
		
		String mensaje = "Mi colega es: " + c;
		
		System.out.println(mensaje);
	}
}
