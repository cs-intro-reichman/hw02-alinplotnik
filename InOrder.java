/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		   int x = (int) (10.0 * Math.random());
		   int y;
		   String temp = "";

        do {
			temp += x + " ";
            y = (int) (10.0 * Math.random());

            if (y < x) {
                break;
            }
            else{
				x = y;
			}
		  
        } while (true);
		System.out.print(temp);
    }

		

}

