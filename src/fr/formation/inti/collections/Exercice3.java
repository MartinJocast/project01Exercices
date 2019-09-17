package fr.formation.inti.collections;

import java.util.ArrayList;
import java.util.List;

public class Exercice3 {

	public static void main(String[] args) {

		List<Cercle> listCercle = new ArrayList<Cercle>();
		
		// instanciation d'objets a partir de la classe Cercle
		Cercle c1 = new Cercle(4, 5, 12.5); 
		Cercle c2 = new Cercle(7, 1, 8.2); 
		Cercle c3 = new Cercle(-6, -3, 17.8); 
		Cercle c4 = new Cercle(5, 2, 4.1); 
		Cercle c5 = new Cercle(8, -6, 11.0); 
		
		listCercle.add(c1);
		listCercle.add(c2);
		listCercle.add(c3);
		listCercle.add(c4);
		listCercle.add(c5);

		for (Cercle c : listCercle) {
			c.affiche();
		}
		
	}
}
