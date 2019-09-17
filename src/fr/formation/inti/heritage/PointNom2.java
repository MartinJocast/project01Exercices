package fr.formation.inti.heritage;

public class PointNom2 extends Point {

	private String nom;
	
	// constructeur
	public PointNom2(int x, int y, String nom) {
		initialise(x, y);
		this.nom = nom;
	}
	
	// constructeur par defaut
	public PointNom2() {
	}
	
	/**
	 * Methode qui affiche les coordonnes d'un objet de type PointNom
	 */
	public void affiche() {
		System.out.println("Coordonnees : " + super.getX() + " " + super.getY() +" Nom du point : " + nom);
	}

	
	// Getters & Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
