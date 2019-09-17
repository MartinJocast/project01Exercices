package fr.formation.inti;

import java.util.Scanner;

public class Tableau2Exercice7 {

	/**
	 * Programme qui lit une suite de mots et qui les affiche tries par ordre alphabetique
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Lecture du nombre de mots
		System.out.println("Combien de mots ?");
		int nb = sc.nextInt();
		
		
		// Lecture des mots et enregistrement dans un tableau str et dans un tableau strTri qui sera trie par la suite
				String str[] = new String[nb];
		String strTri[] = new String[nb];
		System.out.println("Donnez vos mots (cliquez sur entree entre chaque mot) :");
		for (int i=0; i<nb; i++) {
			str[i] = strTri[i] = sc.next();
		}
		
		for (int i=0; i<nb-1; i++) { // premiere boucle: mot qui sera compare aux autres
			for (int j=i+1; j<nb; j++) { // deuxieme boucle: on examine tous les mots suivants
				if (strTri[i].compareToIgnoreCase(strTri[j]) > 0) { // si le mot(j) est alphabetiquement avant le mot(i), on effectue l'echange de position
					echanger(strTri, i, j);
				}
			}
		}
		
		System.out.println("Liste par ordre alphabetique :");
		affichageS(strTri);
		sc.close();
	}
	
	
	/**
	 * Methode qui la position de 2 chaines de caracteres au sein d'un tableau
	 * @param tab
	 * @param i
	 * @param j
	 */
	public static void echanger(String tab[], int i, int j) {
		String memoire = tab[i];
		tab [i] = tab [j];
		tab [j] = memoire;
	}
	
	/**
	 * Methode statique qui renvoie les valeurs d'un tableau de chaines de caracteres (String) reçu en argument
	 * @param tab
	 * @return
	 */
	public static void affichageS(String tab[]) {
		for(String v: tab) {
			System.out.println(v);
		}
		System.out.println();
	}
}
