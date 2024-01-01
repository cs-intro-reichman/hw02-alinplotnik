/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;
		
		while (i < n){
			
			if ((i % 2) == 0){
				for (int j = 0; j < n; j++){
					System.out.print("* ");
				    }
			      }	
			else{
				for (int j = 0; j < n; j++){
					System.out.print(" *");
				    }
			}	
			
			System.out.println();
		    i++;
		}
		  
		  
	}
	
}
 