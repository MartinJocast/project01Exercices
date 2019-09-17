package fr.formation.inti.poo;

public class App {

	public static void main(String[] args) {
		Stagiaire stg = new Stagiaire("Jollivet-Castelot", "Martin");
		stg.affichage();
		stg.getNom();
		stg.setNom("test");

		System.out.println(stg.getNom());
		
		stg.parler();
	}
}
