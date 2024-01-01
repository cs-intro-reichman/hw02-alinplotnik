/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]);
		Boolean isDividing = false; 
		
		  for(int i = 1; i <= num; i++){
			  isDividing = (num % i == 0);
			  if (isDividing){
				  System.out.println(i);
			  }
		  }
		  
		
		
		
	}
}
