package es.cursogetafe.vista.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/menu_principal")
public class MenuPrincipal extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sesion = req.getSession();
		
		if(sesion.getAttribute("usr") != null)
			req.getRequestDispatcher("/WEB-INF/vistas/tabla.html").include(req, resp);
		else
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		
	}
	
}
