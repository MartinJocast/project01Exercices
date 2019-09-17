package fr.formation.inti;

import java.util.Scanner;

public class Tableau2Exercice3 {

	public static void main(String[] args) {
		// Lecture de la chaine de caracteres
		Scanner sc = new Scanner(System.in);
		System.out.println("Ecrivez une chaine de caracteres :");
		String str = sc.nextLine();
		
		// Programme qui affiche un caractere sur deux de la chaine
		for(int i=0; i<str.length(); i=i+2) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		// Programme qui affiche le premier et le dernier caractere
		System.out.println("Le premier caractere est : "+str.charAt(0));
		System.out.println("Le dernier caractere est : "+str.charAt(str.length()-1));
	
		sc.close();
	}
}
