package fr.formation.inti.heritage;

public class A2 {
	// Exercice 4
	public int n; // exceptionnellement pas d'encapsulation
	public int p=10;
	public A2 (int nn) {
		System.out.println("Entree Constr A - n= " + n + " p= " + p);
		n=nn;
		System.out.println("Entree Constr A - n= " + n + " p= " + p);
	}
}
