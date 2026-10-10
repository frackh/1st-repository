public class Task_1 {
	public static void main(String Arg[]){
		System.out.println("");

		int n = 97;
		char c1 = 'a';
		char c2 = 'b';

		boolean b1 = c1 != c2;
		System.out.println("c1 != c2 is " + b1);
		boolean b2 = c1 > c2;
		System.out.println("c1 > c2 is " + b2);
		boolean b3 = c1 < c2;
		System.out.println("c1 < c2 is " + b3);
		boolean b4 = c1 == c2 - 1;
		System.out.println("c1 == c2 - 1 is " + b4);
		boolean b5 = c2 > n;
		System.out.println("c2 > n is " + b5);
		boolean b6 = c1 == 'a';
		System.out.println("c1 == 'a' is " + b6);
		boolean b7 = c1 == n;
		System.out.println("c1 == n is " + b7);
		boolean b8 = c2 - c1 == 1;
		System.out.println("c2 - c1 == 1 is " + b8);

		System.out.println("");

		int m = 64;
		int r1 = m << 1;
		System.out.println("m << 1 is " + r1);
		int r2 = m << 2;
		System.out.println("m << 2 is " + r2);
		int r3 = m << 3;
		System.out.println("m << 3 is " + r3);
		int r4 = m >> 1;
		System.out.println("m >> 1 is " + r4);

	}
}