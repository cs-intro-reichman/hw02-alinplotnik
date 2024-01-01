/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		String temp = N + " is a perfect number since " + N + " = 1";
		Boolean isDividing = true;
		int divSum = 1;
		for( int i = 2; i < N; i++){
			if( N % i == 0 ){
				divSum += i;
				temp += " + " + i;
			}
		}
		if (divSum == N){
			System.out.println(temp);
		}
		else {
			System.out.println(N +" is not a perfect number");
		}
	}
}
