package fr.formation.inti;

import java.util.Scanner;

public class Tableau2Exercice4 {

	public static void main(String[] args) {
		// Lecture d'un entier au clavier
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un nombre entier :");
		String str = sc.nextLine();
		
		// Programme qui affiche verticalement l'entier lu
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		sc.close();
	}
}
