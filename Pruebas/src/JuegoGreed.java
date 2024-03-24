import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JuegoGreed {

	public static int greedy(int[] dice){
	    
		Map<Integer, Integer> num = new HashMap<>();
		
		Arrays.stream(dice).forEach(x -> {int valor = 1; if(num.containsKey(x)) valor = num.get(x) + 1; num.put(x, valor);});
		
		
		return 0;
	}

}
