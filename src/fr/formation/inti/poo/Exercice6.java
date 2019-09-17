package fr.formation.inti.poo;

public class Exercice6 {

	public static void main(String[] args) {

		Z z = new Z();
		int n =5;
		z.g(n);
		z.f(n);
		Z.f(n);
	}
}

class Z {
	static int f (int n) {
		return q = n;
	}
	void g (int n) {
		q = n;
		p = n;
	}
	
	static private int p = 20;
	static private int q;
	
}
