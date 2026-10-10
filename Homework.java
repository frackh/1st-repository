public class Homework {
	public static void main (String[] Arg){
		System.out.println("\t-------------------------------------------");
		System.out.print("\t|val1 |");
		System.out.print("val2 |");
		System.out.print(" and |");
		System.out.print(" or  |");
		System.out.print(" xor |");
		System.out.print("not1 |");
		System.out.println("not2 |");
		System.out.println("\t-------------------------------------------");
		boolean va1 = true;
		boolean va2 = false;
		System.out.print("\t|" + va1 + " |");
		System.out.print(va2 + "|");
		System.out.print((va1 & va2) + "|");
		System.out.print((va1 | va2) + " |");
		System.out.print((va1 ^ va2) + " |");
		System.out.print(!va1 + "|");
		System.out.println(!va2 + " |");
		System.out.println("\t-------------------------------------------");
		boolean va3 = false;
		boolean va4 = true;
		System.out.print("\t|" + va3 + "|");
		System.out.print(va4 + " |");
		System.out.print((va3 & va4) + "|");
		System.out.print((va3 | va4) + " |");
		System.out.print((va3 ^ va4) + " |");
		System.out.print(!va3 + " |");
		System.out.println(!va4 + "|");
		System.out.println("\t-------------------------------------------");
		boolean va5 = true;
		boolean va6 = true;
		System.out.print("\t|" + va5 + " |");
		System.out.print(va6 + " |");
		System.out.print((va5 & va6) + " |");
		System.out.print((va5 | va6) + " |");
		System.out.print((va5 ^ va6) + "|");
		System.out.print(!va5 + "|");
		System.out.println(!va6 + "|");
		System.out.println("\t-------------------------------------------");
		boolean va7 = false;
		boolean va8 = false;
		System.out.print("\t|" + va7 + "|");
		System.out.print(va8 + "|");
		System.out.print((va7 & va8) + "|");
		System.out.print((va7 | va8) + "|");
		System.out.print((va7 ^ va8) + "|");
		System.out.print(!va7 + " |");
		System.out.println(!va8 + " |");
		System.out.println("\t-------------------------------------------");

	}
}