package fr.formation.inti.poo;

public class Exercice9 {

	public static void main(String[] args) {

		A3 a = new A3(2);
		int n=2;
		System.out.println("valeur de a avant : "+a.getn());
		Util3.incre(a, 5);
		System.out.println("valeur de a apres : "+a.getn());
		System.out.println("valeur de n avant : "+n);
		Util3.incre(n, 5);
		System.out.println("valeur de n apres : "+n);
	}

}

class A3 {
	public A3 (int nn) {
		n=nn;
	}
	public int getn() {
		return n;
	}
	public void setn (int nn) {
		n=nn;
	}
	private int n;
}

class Util3 {
	public static void incre (A3 a, int p) {
		a.setn(a.getn()+p);
	}
	public static void incre (int n, int p) {
		n += p;
	}
}