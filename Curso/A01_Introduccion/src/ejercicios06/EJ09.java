package ejercicios06;

public class EJ09 {
	static String[] users = {"root","admin","pepito"};
	static String[] pass = {"root_x","admin_x","pepito_x"};
	
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Debe ejecutar 'java ejerciciosArrays.Ejercicio09 <usr> <pwd>'");
			return;
		}
		System.out.println("Ejecutando programa");
		int posUsr = checkUsr(args[0]);
		if(posUsr == -1) {
			System.out.println("Usuario " + args[0] + " inexistente!");
			return;
		}
		if(!pass[posUsr].equals(args[1])) {
			System.out.println("Contraseña incorrecta para el usuario " + args[0]);
			return;
		}
		
		System.out.println("Usuario y contraseña correctos. Bienvenido usuario " + args[0]);
		
	}
	
	public static int checkUsr(String usr) {
		int pos = -1;
		for (int i = 0; i < users.length && pos == -1; i++) {
			if(users[i].equals(usr)) pos = i;
		}
		return pos;
	}
//	
//	public static int checkPwd(String pwd) {
//		int pos = -1;
//		for (int i = 0; i < pass.length && pos == -1; i++) {
//			if(pass[i].equals(pwd)) pos = i;
//		}
//		return pos;
//	}
}
