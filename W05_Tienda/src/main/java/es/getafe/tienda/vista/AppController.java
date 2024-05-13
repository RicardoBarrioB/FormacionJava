package es.getafe.tienda.vista;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class AppController {
	
	@GetMapping({"/", "menu_principal"})
	public String menuPrincipal() {
		return "menu_principal";
	}

}
