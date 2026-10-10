public class Task_6 {
	public static void main(String Arg[]) {
		int rad = 2;
		for (int y = -rad; y <= rad; y++) {
			for (int x = -rad; x <= rad; x++) {
				if (x*x + y*y <= rad*rad) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}