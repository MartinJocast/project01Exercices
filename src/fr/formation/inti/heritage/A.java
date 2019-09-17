package fr.formation.inti.heritage;

public class A {

	// Exercice 7
	public void f (int n, float x) {
		System.out.println("f(int n, float x)\tn =" + n + " x = " + x);
	}
	private void f (long q, double y) {
		System.out.println("f(long q, double y)\tq =" + q + " y = " + y);
	}
	public void f (double y1, double y2) {
		System.out.println("f(double y1, double y2)\ty1 =" + y1 + " y2 = " + y2);
	}
	public void g() {
		int n=1; long q=12; float x=1.5f; double y=2.5;
		System.out.println("--- dans g ");
		f(n,q);
		f(q,n);
		f(n,x);
		f(n,y);
	}
	

}
