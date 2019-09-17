package fr.formation.inti.heritage;

// Exercice 5
public class A3 {
	public void affiche() {
		System.out.println("Je suis un A");
	}
}

class B3 extends A3 {	
}
class C3 extends A3 {
	public void affiche() {
		System.out.println("Je suis un C");
	}
}
class D3 extends C3 {
	public void affiche() {
		System.out.println("Je suis un D");
	}
}
class E3 extends B3 {
}
class F3 extends C3 {
}
