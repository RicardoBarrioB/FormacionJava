package ahorcado;

public class Dibujar {
	public static void dibujo (int intentos){
		    switch (intentos) {
		    case 6:
		        System.out.println(" _______");
		        System.out.println("|       |");
		        System.out.println("|");
		        System.out.println("|");
		        System.out.println("|");
		        System.out.println("|__________\n");
		        break;
		    case 5:
		        System.out.println(" _______");
		        System.out.println("|       |");
		        System.out.println("|       O");
		        System.out.println("|");
		        System.out.println("|");
		        System.out.println("|__________\n");
		        break;
		    case 4:
		        System.out.println(" _______");
		        System.out.println("|       |");
		        System.out.println("|       O");
		        System.out.println("|       |");
		        System.out.println("|");
		        System.out.println("|__________\n");
		        break;
		    case 3:
		        System.out.println(" _______");
		        System.out.println("|       |");
		        System.out.println("|       O");
		        System.out.println("|      /|");
		        System.out.println("|");
		        System.out.println("|__________\n");
		        break;
		    case 2:
		        System.out.println(" _______");
		        System.out.println("|       |");
		        System.out.println("|       O");
		        System.out.println("|      /|\\");
		        System.out.println("|");
		        System.out.println("|__________\n");
		        break;
		    case 1:
		        System.out.println(" _______");
		        System.out.println("|       |");
		        System.out.println("|       O");
		        System.out.println("|      /|\\");
		        System.out.println("|      /");
		        System.out.println("|__________\n");
		        break;
		    case 0:
		        System.out.println(" _______");
		        System.out.println("|       |");
		        System.out.println("|       O");
		        System.out.println("|      /|\\");
		        System.out.println("|      / \\");
		        System.out.println("|__________\n");
		        break;
		    default:
		        System.out.println("El dibujo no está disponible.");
		}
	}
}
