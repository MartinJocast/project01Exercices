package fr.formation.inti;

import java.util.Scanner;

public class TableauExercice3 {

	public static void main(String[] args) {
		double tab[] = new double[5];
		double somme = 0, min, max;
		double moy;

		Scanner sc = new Scanner(System.in);

		/*
		 * On lit dans cette boucle les 5 valeurs et on les enregistre dans le tableau.
		 * On calcule au fur et à mesure la somme de ces valeurs, qui servira à calculer la moyenne.
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println("Valeur " + (i + 1) + " :");
			tab[i] = sc.nextDouble();
			somme += tab[i];
		}
		
		min=max=tab[0]; // On initialise les variables min et max avec la première valeur du tableau.
		// On cherche dans cette boucle les valeurs min et max du tableau.
		for(double v:tab) { 
			if(v<min) {
				min=v;
			}
			if(v>max) {
				max=v;
			}
		}
		
		moy = somme / tab.length;
		System.out.println("La moyenne est " + moy);
		System.out.println("La plus petite valeur est " + min);
		System.out.println("La plus grande valeur est " + max);
		
		sc.close();
	}
}
