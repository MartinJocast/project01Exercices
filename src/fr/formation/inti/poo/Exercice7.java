package fr.formation.inti.poo;

public class Exercice7 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.g();
		System.out.println("--- dans main");
		int n=1; long q=12; float x=1.5f; double y=2.5;
		a.f(n, q);
		a.f(q, n);
		a.f(n, x);
		a.f(n, y);
		
	}
}

class A2 {
	public void f(int n, float x) {
		System.out.println("f(int n, float x)\tn = " + n + " x = " + x);
	}
	public void f(long q, double y) {
		System.out.println("f(long q, double y)\tq = " + q + " y = " + y);
	}
	public void f(double y1, double y2) {
		System.out.println("f(double y1, double y2)\ty1 = " + y1 + " y2 = " + y2);
	}
	public void g() {
		int n=1; long q=12; float x=1.5f; double y=2.5;
		System.out.println("--- dans g ");
		f(n, q);
		f(q, n);
		f(n, x);
		f(n,y);
	}
}
