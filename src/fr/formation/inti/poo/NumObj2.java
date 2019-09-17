package fr.formation.inti.poo;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class NumObj2 {

	// attributs 
	private int ident=0;
	private static int identMax=0;
	
	
	// constructeur
	public NumObj2() {
		identMax++;	 // on incremente le nombre d'objets crees de 1 a chaque utilisation du constructeur
		ident = lireNumero();
	}
	
	public int getIdent() {
		return ident;
	}
	
	public static int getIdentMax() {
		return identMax;
	}
	
	/**
	 * methode qui demande a l'utilisateur de rentrer le numero initial des objets
	 * @return
	 */
	public static int lireNumero() {
		System.out.println("Quel est le numero initial de l'objet ?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num<=0) {
			System.out.println("Quel est le numero initial de l'objet ? (il doit etre strictrement positif)");
			num = sc.nextInt();
		}
		return num;
	}
}
