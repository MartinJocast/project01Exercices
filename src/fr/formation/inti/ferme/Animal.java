package fr.formation.inti.ferme;

public class Animal {

	protected String nom;
	protected double poids;
	
	public void affichage() {
		System.out.println("Je suis un animal");
	}

	
	
	public Animal() {
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}
	
}
