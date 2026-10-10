public class Oct_10 {
	public static void main(String Arg[]) {
		System.out.println(exp(1));
	}

	public static double exp(double x){
		double e = 1 + x;
		double eps = 1e-6;
		double s = x;
		int n = 2;
		while((s > eps) || (s < -eps)){
			s = s * x / (n++);
			e = e + s;
		}
		return e;
	}
}