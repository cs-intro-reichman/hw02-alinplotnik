
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		String tempString = "";
		boolean isGirl = false;
		boolean isBoy = false;
		int count = 0;
		
		for (int i = 0; !isGirl || !isBoy; i++){
			double x = Math.random() ;
			if ( x >= 0.5 ) {
				isGirl = true ;
				tempString += "g ";
			}
			else {
				isBoy = true ; 
				tempString += "b " ;
			}
			count++;
		}
		System.out.println(tempString + " ");
		System.out.println("You made it... and you now have " + count + " children.");
			
			
		}
		
	}

