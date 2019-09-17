package fr.formation.inti.heritage;

// Exercice 6
public class Poly {

	public static void main(String[] args) {

		A4 a = new A4(); a.affiche(); System.out.println();
		B4 b = new B4(); b.affiche();
		a = b; a.affiche(); System.out.println();
		
		C4 c = new C4(); c.affiche();
		a = c; a.affiche(); System.out.println();
		
		D4 d = new D4(); d.affiche(); 
		a = d; a.affiche();
		c = d; c.affiche(); System.out.println();
		
		E4 e = new E4(); e.affiche(); 
		a = e; a.affiche();
		b = e; b.affiche(); System.out.println();
		
		F4 f = new F4(); f.affiche(); 
		a = f; a.affiche();
		c = f; c.affiche(); System.out.println();
		
	}
}
