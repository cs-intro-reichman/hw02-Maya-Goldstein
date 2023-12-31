/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int rand1 = (int)( Math.random() * 10);
		int rand2 = (int)( Math.random() * 10);
		System.out.print(rand1);
		while (rand1 <= rand2) {
			System.out.print(" " + rand2);
			rand1 = rand2;
			rand2 = (int)( Math.random() * 10);
		}


	}
}
