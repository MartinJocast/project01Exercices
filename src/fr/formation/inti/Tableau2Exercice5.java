package fr.formation.inti;

import java.util.Scanner;

public class Tableau2Exercice5 {

	public static void main(String[] args) {
		// Lecture d'un entier au clavier
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un mot :");
		String str = sc.nextLine();
		
		// Programme qui compte le nombre de repetitions de chaque voyelle (a,e,i,o,u,y) : boucle Selon
		int nbA=0, nbE=0, nbI=0, nbO=0, nbU=0, nbY=0;
		
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
			// On compte le nombre de A (65) et de a (97)
			case 65:
			case 97: 
				nbA++;
				break;
			// On compte le nombre de E (69) et de e (101)
			case 69:
			case 101:
				nbE++;
				break;
			// On compte le nombre de I (73) et de i (105)
			case 73:
			case 105:
				nbI++;
				break;
			// On compte le nombre de O (79) et de i (111)
			case 79:
			case 111:
				nbO++;
				break;
			// On compte le nombre de U (85) et de i (117)
			case 85:
			case 117:
				nbU++;
				break;
			// On compte le nombre de Y (89) et de y (121)
			case 89:
			case 121:
				nbY++;
				break;
			default:
				break;
			}
		}
		
		// Affichage du nombre de voyelles
		System.out.println("Il comporte \n"+nbA+" fois la lettre a\n"+nbE+" fois la lettre e \n"+nbI+" fois la lettre i \n"+nbO+" fois la lettre o \n"+nbU+" fois la lettre u \n"+nbY+" fois la lettre y");

		
		sc.close();
	}
}
