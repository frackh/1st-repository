public class Task_4{
	public static void main(String Arg[]){
		int n = 50;
		for (int p = 2; p <= n; p++){
			boolean Prime = true;
			for (int d = 2; d <= p/2; d++){
				if (p % d == 0){
					Prime = false;
					break;
				}
			}
			if (Prime == true){
				System.out.print(p + " ");
			}
		}
	}
}