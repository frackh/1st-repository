public class Task_3 {
	public static void main(String Arg[]){
		char c1 = 'И', c2 = 'Т', c3 ='И', c4 = 'С';
		long k = 0x2da295b3;
		long m = 0;
		m = m | ((long) c1 << 48);
		m = m | ((long) c2 << 32);
		m = m | ((long) c3 << 16);
		m = m | ((long) c4);
		long s = 0;
		s = m ^ k;
		System.out.println("зашифрованное слово " + s);
		m = s ^ k;
		c1 = (char)(m >> 48);
		c2 = (char)(m >> 32);
		c3 = (char)(m >> 16);
		c4 = (char)(m);
		System.out.println("расшифрованное слово " + c1 + c2 + c3 + c4);
	}
}