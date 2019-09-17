package fr.formation.inti.poo;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class NumObj {

	// attributs 
	private int ident=0;
	private static int identMax=0;
	
	
	// constructeur
	public NumObj() {
		identMax++;	 // on incremente le nombre d'objets crees de 1 a chaque utilisation du constructeur
		ident = identMax; // on enregistre dans ident la valeur de identMax lors de la creation de l'objet
	}
	
	public int getIdent() {
		return ident;
	}
	
	public static int getIdentMax() {
		return identMax;
	}
}
