package fr.formation.inti;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		int jour, heure;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduire le jour de la semaine");
		jour = sc.nextInt();
		System.out.println("Introduire l'heure pile du jour");
		heure = sc.nextInt();

		switch (jour) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			test(jour, heure);	
			break;
		case 6:
		case 7:
			System.out.println("Bon Week-end");
			break;
		default:
			System.out.println("Ce jour n'existe pas");
			break;
		}

		sc.close();
	}

	public static void test(int jour, int heure) {
		if (heure > 0 && heure <= 24) {
			if ((heure >= 8 && heure <= 12) || (heure >= 14 && heure <= 18)) {
				System.out.println("Bon travail");
				System.out
						.println((24 * --jour + heure) + " heures ont été écoulées depuis le début de la semaine");
			} else {
				System.out.println("Bon repos");
				System.out
						.println((24 * --jour + heure) + " heures ont été écoulées depuis le début de la semaine");
			}
		} else {
			System.out.println("Cette heure n'existe pas");
		}
	}
}
