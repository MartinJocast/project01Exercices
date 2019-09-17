package fr.formation.inti;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		int interm, nombre, facto;
		char reponse = 0;

		Scanner sc = new Scanner(System.in);

		while (reponse != 'Q') {
			System.out.println("Introduire la valeur � calculer");
			nombre = sc.nextInt();

			if (nombre >= 0) {
				facto = 1;
				for (interm = 1; interm <= nombre; interm++) {
					facto = facto * interm;
				}
				System.out.println("La factorielle de " + nombre + " est " + facto);
			} else {
				System.out.println("Le nombre introduit n'est pas correct");
			}

			System.out.println("Voulez-vous continuer (Q pour quitter) ?");
			String str = sc.next();
			reponse = str.charAt(0);
		}
		sc.close();
	}
}
