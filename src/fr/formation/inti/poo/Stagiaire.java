package fr.formation.inti.poo;

public class Stagiaire extends Personne {

	private String nom;
	String prenom;
	private int age;
	
	
	@Override
	public void parler() {
		System.out.println("Je suis un stagiaire");
		super.parler();
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	/**
	 * constructeur par defaut
	 */
	public Stagiaire() {
		System.out.println("constructeur par defaut");
	}
	
	public Stagiaire(String nom, String prenom) {
		System.out.println("nom : "+nom+", prenom : "+prenom);
	}
	
	public void affichage() {
		System.out.println("exemple de methode de stagiaire");
	}
}
