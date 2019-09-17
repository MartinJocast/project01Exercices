package fr.formation.inti.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercice1 {

	public static void main(String[] args) {

		LinkedList<Integer> liste = new LinkedList<Integer>(); // creation d'une liste pouvant enregistrer et lire des Intergers
		liste.add(3);
		liste.add(5);
		liste.add(3);
		liste.add(12);
		liste.add(3);
		System.out.println(liste);
		liste.remove(3);  // enleve de la liste la valeur correspondant a l'index 3 (12)
		System.out.println(liste);
		liste.remove(new Integer(3));  // enleve la premiere occurence de la valeur de l'objet en argument (3)
		System.out.println(liste);
		Iterator<Integer> it = liste.iterator(); // iterator permet de contenir dans un objet (it) une serie de donnees constantes qui permettra de parcourir la liste
		while (it.hasNext()) {  // hasNext retourne un booleen vrai s'il y a un element a iterer dans l'ordre croissant des index
			if (it.next() == 3)
				it.remove();  // boucle qui parcours la liste et qui enleve toutes les valeurs 3
		}
		System.out.println(liste);
	}
}
