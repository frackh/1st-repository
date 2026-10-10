public class Task_2 {
	public static void main(String Arg[]) {
		System.out.println("");

		int x = 1;
		int y = 3;
		int z;
		char c1 = 'a';
		char c2 = 'b';
		boolean b = false;
		boolean b1 = (z = c2 - c1++) == 1 ^ true;
		System.out.println("(z = c2 - c1++) == 1 ^ true is " + b1);
		boolean b2 = (x++ - --y) * (x-- + --y) == 0 || !(z == 2);
		System.out.println("(x++ - --y) * (x-- + --y) == 0 || !(z == 2) is " + b2);
		z = ++x % y - z * 2 & 0b00001011;
		System.out.println("++x % y - z * 2 & 0b00001011 is " + z);
	}
}