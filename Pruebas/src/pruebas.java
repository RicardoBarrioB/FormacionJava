
public class pruebas {

	public static String comprobar (String[][] array) {
		
		int contY = 0;
		int contR = 0;
		String ganador;
		
		for(int i = 0; i < 6 && contR < 4 && contY < 4; i++) {
			contY = 0;
			contR = 0;
			for(int j = 0; j < 7 && contR < 4 && contY < 4; j ++) {
				int k = 0;
				if(i > 2) {
					k = j*2;
				}
				
				if(array[j][j+i-k].equals("R")) {
					contR++;
					contY = 0;
				}else if( array[j][j+i-k].equals("Y")) {
					contY++;
					contR = 0;
				}else {
					contY = 0;
					contR = 0;
				}
			}
		}
		
		for(int i = 0; i < 6 && contR < 4 && contY < 4; i++) {
			contY = 0;
			contR = 0;
			for(int j = 0; j < 7 && contR < 4 && contY < 4; j ++) {
				int k = 0;
				if(i > 2) {
					k = j*2;
				}
				
				if(array[6-j][j+i-k].equals("R")) {
					contR++;
					contY = 0;
				}else if( array[6-j][j+i-k].equals("Y")) {
					contY++;
					contR = 0;
				}else {
					contY = 0;
					contR = 0;
				}
			}
		}
		
		if(contY == 4) {
			ganador = "Y";
		}else if(contR == 4){
			ganador = "R";
		}else {
			ganador = "Draw";
		}
	
		return ganador;
	}
	
}
