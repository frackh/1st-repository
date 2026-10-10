public class Task_5{
	public static void main(String Arg[]){
		double a = 49;
		double k = a;
		double n = 0;
		double eps = 0.01;
		while (k - n > eps){
			double q1 = (n + k)/2;
			if (q1 * q1 < a) {n = q1;}
				else{k = q1;}
		}
		System.out.print((k + n)/2);
	}
}