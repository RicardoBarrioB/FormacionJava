package agenda.modelo;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class Contacto implements Comparable<Contacto> {

	private int idContacto;
	private String nombre;
	private String apellidos;
	private String apodo;
	private Domicilio dom;
	private String[] telefonos;
	private String[] correos;
	
	private int cantTelefonos;
	private int cantCorreos;
	private static final int MAX_ARRAYS = 10;
	
	public Contacto() {
		telefonos = new String[MAX_ARRAYS];
		correos = new String[MAX_ARRAYS];
		dom = new Domicilio();
	}

	public Contacto(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Contacto(String nombre, String apellidos, String apodo) {
		this(nombre);
		this.apellidos = apellidos;
		this.apodo = apodo;
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Domicilio getDom() {
		return dom;
	}

	public void setDom(Domicilio dom) {
		this.dom = dom;
	}

	public String[] getTelefonos() {
		String[] guardados = new String[cantTelefonos];
		for(int i = 0; i < cantTelefonos; i++) {
			guardados [i] = telefonos[i];
		}
		return guardados;
	}

	public void setTelefonos(String... telefonos) {
		this.telefonos = new String[MAX_ARRAYS];
		cantTelefonos = 0;
		
		for(int i = 0; i < telefonos.length; i++) {
			addTelefono(telefonos[i]);
		}
	}
	
	public void addTelefono(String telefono) {
		if (cantTelefonos < MAX_ARRAYS) {
			telefonos[cantTelefonos++] = telefono;
		}
	}

	public String[] getCorreos() {
		String[] guardados = new String[cantCorreos];
		for(int i = 0; i < cantCorreos; i++) {
			guardados [i] = correos[i];
		}
		return guardados;
	}

	public void setCorreos(String[] correos) {
		this.correos = new String[MAX_ARRAYS];
		cantCorreos = 0;
		
		for(int i = 0; i < correos.length; i++) {
			addCorreos(correos[i]);
		}
	}
	
	public void addCorreos(String correo) {
		if (cantCorreos < MAX_ARRAYS) {
			correos[cantCorreos++] = correo;
		}
	}

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Contacto other = (Contacto) obj;
		return idContacto == other.idContacto;
	}*/
	
	

	@Override
	public String toString() {
		return "Contacto [" + idContacto + ", " + nombre + ", " + apellidos + ", " + apodo + "]";
	}

	@Override
	public int hashCode() {
		return idContacto;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return idContacto == other.idContacto;
	}

	@Override
	public int compareTo(Contacto o) {
		
		if(this.equals(o)) return 0;
		
		Collator col = Collator.getInstance(new Locale("es"));
		
		return col.compare(this.nombre + this.idContacto, o.nombre + o.idContacto);
		
	//	return (this.nombre + this.idContacto).compareToIgnoreCase(o.nombre + o.idContacto);
		
	//	return this.idContacto - o.idContacto;
	}
	
	
	//Opcion 3 Comparator:	
	public static Comparator<Contacto> getIdComparator(){
		return new Comparator<Contacto>() {
			@Override
			public int compare(Contacto c1, Contacto c2) {
				return c1.getIdContacto() - c2.getIdContacto();
			}
		};
	}
	
	public static int compare(Contacto c1, Contacto c2) {
		return c1.getIdContacto() - c2.getIdContacto();
	}
}



