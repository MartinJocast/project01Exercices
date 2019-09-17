package fr.formation.inti.heritage;

public class PointNom extends Point {

	private String nom;
	
	// constructeur
	public PointNom(int x, int y, String nom) {
		initialise(x, y);
		this.nom = nom;
	}
	
	// constructeur par defaut
	public PointNom() {
	}
	
	/**
	 * Methode qui affiche les coordonnes d'un objet de type PointNom
	 */
	public void affCoordNom() {
		affCoord();
		System.out.println("Nom du point : "+nom);
	}

	
	// Getters & Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
