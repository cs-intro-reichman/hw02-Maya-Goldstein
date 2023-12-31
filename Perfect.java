/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int sum = 1; 
		String print = N + " is a perfect number since " + N + " = 1"; 

		for (int i = 2; i <= N / 2; i++) {
			if (N % i == 0) {
				sum += i;
				print += " + " + i;
			}
		}

		if (N == sum)
			System.out.println(print);
		else 
			System.out.println(N + " is not a perfect number");
	}
}
