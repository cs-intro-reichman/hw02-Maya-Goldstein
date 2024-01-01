/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String reverse = "";
		int n = s.length();
		int mid = n / 2;

		for (int i = n-1; i >= 0; i--) {
			reverse += s.charAt(i);
			}

		System.out.println(reverse);
		System.out.println("The middle character is " + reverse.charAt(mid));
		
	}
}


