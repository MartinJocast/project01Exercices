package fr.formation.inti.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Exercice2 {

	public static void main(String[] args) {

		// declaration de l'objet tab
		List<Integer> tab = new ArrayList<Integer>();
		List<Integer> tab2 = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10); // autre façon d'instancier une liste
		
		// ajout d'objets Integer dans la liste tab
		for (int i=-10; i<=10; i++) {
			tab.add(i);
		}
		
		// affichage dans l'ordre naturel (ordre d'entree des objets)
		System.out.println("tab - ordre naturel : "+tab);
		
		// affichage dans l'ordre inverse
		List<Integer> tabReverse = new ArrayList<Integer>(tab);
		Collections.reverse(tabReverse);
		System.out.println("tab - ordre inverse : "+tabReverse);

		// autre methode d'affichage dans l'ordre inverse
		// pour utiliser cette methode il faut que le curseur soit situé a la fin de la collection, il est donc necessaire d'utiliser le listIterator pour deplacer le curseur du debut vers la fin de la liste (tout en affichant son contenu)
		ListIterator<Integer> it = tab2.listIterator(); 
		System.out.print("tab2 - ordre naturel : ");
		while (it.hasNext()) {  
			System.out.print(it.next()+" "); 
		} System.out.println();
		System.out.print("tab2 - ordre inverse : ");
		while (it.hasPrevious()) {  
			System.out.print(it.previous()+" "); 
		} System.out.println();
		
		// affichage des elements pairs
		System.out.print("tab - elements pairs : ");
		for (int i=0; i<tab.size(); i++) {
			if(tab.get(i)%2 == 0) {
				System.out.print(tab.get(i)+" ");
			}
		} System.out.println();
		
		// mise a zero des elements de valeur negative
		for(int i=0; i<tab.size(); i++) {
			if(tab.get(i)<0) {
				tab.set(i, 0);
			}
		}
		System.out.println("tab - negatif -> zero : "+tab);
	}
}
