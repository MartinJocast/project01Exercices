package fr.formation.inti.collections;

public class Stagiaire implements Comparable<Stagiaire> {
	private String nom;
	private int age;
	private int anneeExperience;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAnneeExperience() {
		return anneeExperience;
	}
	public void setAnneeExperience(int anneeExperience) {
		this.anneeExperience = anneeExperience;
	}
	@Override
	public String toString() {
		return "Stagiaire [nom=" + nom + ", age=" + age + ", anneeExperience=" + anneeExperience + "]";
	}
	public Stagiaire(String nom, int age, int anneeExperience) {
		super();
		this.nom = nom;
		this.age = age;
		this.anneeExperience = anneeExperience;
	}
	public Stagiaire() {
	}
	@Override
	public int compareTo(Stagiaire o) {
		int value = this.age - o.age;
		if(value != 0)
			return value;
		value= this.anneeExperience - o.anneeExperience;
		if(value != 0)
			return value;
		
		return value;
	}
	
	
	
}
