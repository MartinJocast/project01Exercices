package fr.formation.inti.heritage;

public class SurdfAcc {

	public static void main(String[] args) {

		A a = new A();
		a.g();
		System.out.println("--- dans main");
		int n=1; long q=12; float x=1.5f; double y=2.5;
		a.f(n,q);
		a.f(q,n);
		a.f(n,x);
		a.f(n,y);
	}
}
