package fr.formation.inti;

import java.util.Scanner;

/**
 * 
 * @author IN-LL-034
 *
 */

public class Hello {

	public static void main(String[] args) {
		System.out.println("Bonjour !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez a :");
		int a;
		a = sc.nextInt();
		System.out.println("Entrez b :");
		int b = sc.nextInt();
		System.out.println("la somme de "+a+" et "+b+" est "+somme(a, b));
		
		System.out.println("le produit de "+a+" et "+b+" est "+a*b);
		sc.close();
	}
	
	public static int somme(int a, int b) {
		return a+b;
	}

}
