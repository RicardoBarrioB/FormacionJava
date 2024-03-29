package es.cursogetafe.vista.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.cursogetafe.modelo.excepcion.PasswordIncorrectaException;
import es.cursogetafe.modelo.excepcion.UsuarioInexistenteExcepcion;
import es.cursogetafe.modelo.persistencia.UsuarioDao;
import es.cursogetafe.modelo.persistencia.UsuarioDaoImpl;
import es.cursogetafe.modelo.servlets.Usuario;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	private UsuarioDao uDao = new UsuarioDaoImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String usuario = req.getParameter("usuario");
		String password = req.getParameter("password");
		
		if(isNotEmpty(usuario) && isNotEmpty(password)) {
			Usuario actual = null;
			try {
				actual = uDao.valida(usuario, password);
			}catch (UsuarioInexistenteExcepcion e) {
				req.setAttribute("error", "usr");
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			}catch (PasswordIncorrectaException e) {
				req.setAttribute("error", "pass");
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			}
			//iniciar sesion
			HttpSession sesion = req.getSession();
			sesion.setAttribute("usr", actual);
			//Ingreso a la app
			//redireccion
			//le indico que me pida via get la url menu_principal
			resp.sendRedirect("menu_principal");
			
		} else {
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
		
		System.out.println(usuario);
		System.out.println(password);
		
	}
	
	private boolean isNotEmpty(String valor) {
		return valor != null && valor.length() > 0;
	}
	
}
