package interfaces;

@FunctionalInterface
public interface MiInterfazFuncional {
	
	//En una interfaz todo es public no hace falta ponerlo
	//Por defecto son tambien abstractos a no ser que lo indique como en el default
	
	static int num = 18;
	
	static int getNum() {
		return num;
	}
	
	default void saluda() {
		System.out.println("Soy un metodo default!!!!");
	}
	
	int calcula(int mumero);
	
}
