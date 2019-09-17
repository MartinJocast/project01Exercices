package fr.formation.inti.poo;

/**
 * Classe abstraite
 * @author IN-LL-034
 *
 */
public abstract class Personne {
	String nom;
	String prenom;
	String test;
	
//	public abstract void method();
	
	public void parler() {
		System.out.println("Je suis une personne");
	}
	
	public void manger() {
		System.out.println("manger ...!");
	}
	
}
