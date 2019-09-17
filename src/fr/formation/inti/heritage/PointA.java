package fr.formation.inti.heritage;

public class PointA extends Point {

	/**
	 * Methode affiche : imprime abscisse et l'ordonnee du point
	 */
	public void affiche() {
		System.out.println("coordonnees du point : abscisse = " + super.getX() + " ; ordonnee = " + super.getY());
	}
}
