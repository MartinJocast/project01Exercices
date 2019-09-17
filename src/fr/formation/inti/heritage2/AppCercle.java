package fr.formation.inti.heritage2;

import java.util.ArrayList;
import java.util.Date;

public class AppCercle {

	public static void main(String[] args) {

		// AppCercle
//		Cercle c1 = new Cercle(12, 6, 16);
//		c1.affiche(); // Coordonnes : 12 6 Rayon : 16
//		c1.deplaceCentre(13, 7);
//		c1.changeRayon(17);
//		c1.affiche(); // Coordonnes : 13 7 Rayon : 17
//		Point p = c1.getCentre();
//		p.affiche(); // Coordonnes : 13 7

		// AppCercle2
		Cercle2 c2 = new Cercle2(12, 6, 16);
		c2.affiche(); // Coordonnes : 12 6 Rayon : 16
		c2.deplaceCentre(13, 7);
		c2.changeRayon(17);
		c2.affiche(); // Coordonnes : 13 7 Rayon : 17
		Point p = c2.getCentre();
		p.affiche(); // Coordonnes : 13 7
		// autre écriture : c2.getCentre().affiche();
		
		//ArrayList<String> list = new ArrayList<String>();
		
	}
}