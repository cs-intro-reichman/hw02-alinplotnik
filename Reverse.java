/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0]; 
		String reversed = "";
		int middle = (int)(word.length()/2);
		
		for( int i=(int)(word.length()-1); i > -1; i--){
			reversed += word.charAt(i);
		} 
		System.out.println(reversed);
		System.out.println("The middle character is " + reversed.charAt(middle));
	}
}
