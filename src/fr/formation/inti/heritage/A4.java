package fr.formation.inti.heritage;

// Exercice 6
class A4 {
	public void affiche() {
		System.out.print("Je suis un A  ");
	}
}
class B4 extends A4 {
}
class C4 extends A4 {
	public void affiche() {
		System.out.print("Je suis un C  ");
	}
}
class D4 extends C4 {
	public void affiche() {
		System.out.print("Je suis un D  ");
	}
}
class E4 extends B4 {
}
class F4 extends C4 {
}
