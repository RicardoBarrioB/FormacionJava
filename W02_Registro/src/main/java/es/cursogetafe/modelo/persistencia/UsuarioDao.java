package es.cursogetafe.modelo.persistencia;

import es.cursogetafe.modelo.servlets.Usuario;

/**
 * Dao con las funcionalidades para persistir objetos de la clase Usuario
 * 
 * @author Ricardo
 * @version 1.0.0
 * @see Usuario 
 */

public interface UsuarioDao {
	/**
	 * Retorna un usuario dado su id
	 * 
	 * @param id Identificador del Usuario
	 * 
	 * @return Usuario correspondiente o null si no existe 
	 * 
	 */
	Usuario findById(int id);
	
	/**
	 * Valida si existe el usuario y si su password es correcto
	 * @param usuario
	 * @param password
	 * 
	 * @return el Usuario si las credenciales son correctas
	 * 
	 * @throws UsuarioInexistenteException si el usuario no existe
	 * @throws PasswordIncorrecta excepcion si el usuario existe y el password es incorrecto
	 */
	Usuario valida(String usuario, String password);
	
	/**
	 * Graba un usuario o actualiza uno existente
	 * @param usuario o grabar
	 */
	void save(Usuario usuario);

}
