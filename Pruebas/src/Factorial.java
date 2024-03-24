
import java.util.Map;
import java.util.TreeMap;

public class Factorial {

   public static String decomp(int n) {
	   
	   StringBuilder resul = new StringBuilder();
	   Map<Integer, Integer> primos = new TreeMap<>();
	   if(n>=2)
		   primos.put(2, 0);
      
	   for(int i = 3 ; i <= n; i++){
		   boolean primo = true;
		   
		   for (Integer key : primos.keySet()) {
			   if(i%key == 0) {
				   primo = false;
				   break;
			   }
		   }
		   if(primo) {
			   primos.put(i,0);
		   }
	   }
	   
	   for(int i = 2; i <= n; i++) {  
		   int n2 = i; 
		   
		   while(n2 != 1){
			   for (Integer key : primos.keySet()) {
				   int valor = primos.get(key);
    			  
				   if(n2%key == 0) {
					   valor++;
					   primos.put(key,valor);
					   n2 = n2/key;
				   }
			   }
		   }  
	   }
	   
	   for (Integer key : primos.keySet()) {
		   if(primos.get(key) > 1) {
			   resul.append(key).append("^").append(primos.get(key)).append(" * ");
		   }else {
			   resul.append(key).append(" * ");
		   }
	   }
	   resul.setLength(resul.length() - 3);
	   
       return resul.toString();
   }
   
   
   public static void main(String[] args) {
	
	   System.out.println(decomp(4000));
	   
   }
}
















