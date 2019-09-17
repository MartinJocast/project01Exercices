package fr.formation.inti;

public class Test {
	
	/**
	 * Enoncé du test
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Test");
		
		System.out.println(calcul(10, 15, "+"));
	}
	
	/**
	 * Cette méthode calcule la somme
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static int calcul(int a, int b, String action) {
		if(action == "+")
			return a+b;
		else if(action == "*")
			return a*b;
		else
			return -1;
	}
}
