package fr.formation.inti;

import java.util.Scanner;

public class Tableau2Exercice6 {

	public static void main(String[] args) {
		// Lecture d'un mot au clavier
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un verbe regulier du premier groupe :");
		String str = sc.nextLine();
		
		// Verification de la fin du verbe - s'il est faux, on en redemande un autre
		while(!verifER(str)) {
			System.out.println("*** Il ne se termine pas par er - Donnez-en un autre :");
			str = sc.nextLine();
		}
		
		// Affichage de la conjuguaison du verbe au present de l'indicatif
		System.out.println("Je "+str.substring(0, str.length()-1));
		System.out.println("Tu "+str.substring(0, str.length()-1)+"s");
		System.out.println("Il/elle "+str.substring(0, str.length()-1));
		System.out.println("Nous "+str.substring(0, str.length()-2)+"ons");
		System.out.println("Vous "+str.substring(0, str.length()-1)+"z");
		System.out.println("Ils/elles "+str.substring(0, str.length()-1)+"nt");
	
		sc.close();
	}
	
	
	/**
	 * Methode qui verifie qu'un mot se termine par ER (verbe du premier groupe)
	 * @param str
	 * @return
	 */
	public static boolean verifER(String str) {
		boolean reponse;
		if (str.charAt(str.length()-1)=='r' && str.charAt(str.length()-2)=='e') {
			reponse = true;
		}
		else {
			reponse = false;
		}
		return reponse;
	}
}