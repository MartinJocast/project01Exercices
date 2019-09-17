package fr.formation.inti.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class AppStagiaire {
	
	public static void main(String[] args) {
		//create a sortedSet via the subclass TreeSeet
		//Il faut ajouter l'interface comparable dans la classe stagiaire
		//pour definir les criteres de comparaison
		SortedSet<Stagiaire> stagiaires = new TreeSet<Stagiaire>();
		Stagiaire s1 = new Stagiaire("Gauthier", 24, 0);
		Stagiaire s2 = new Stagiaire("Damien", 29, 5);
		Stagiaire s3 = new Stagiaire("Florian", 27, 7);
		Stagiaire s4 = new Stagiaire("Alex", 27, 3);
		
		stagiaires.add(s1);
		stagiaires.add(s2);
		stagiaires.add(s3);
		stagiaires.add(s4);
		for(Stagiaire s : stagiaires) {
			System.out.println(s);
		}


	}
}
