package fr.formation.inti.poo;

/**
 * Classe qui permet de représenter un point sur un axe.
 * Chaque point est caracterise par un nom (char) et une abscisse (double)
 * @author IN-LL-034
 *
 */
public class Point {
	
	// attributs
	private char nomPt;
	private double abs;
	
	// constructeur recevant en arguments nom et abscisse
	public Point(char nomPoint, double abscisse) {
		this.nomPt = nomPoint;
		this.abs = abscisse;
	}
	
	/**
	 * Methode affiche : imprime le nom du point (nomPt) et son abscisse (abs)
	 * @param nomPt
	 * @param abs
	 */
	public void affiche() {
		System.out.println("Nom du point : "+nomPt+" | Abscisse du point : "+abs);
	}

	/**
	 * Methode translate : effectue une translation definie par la valeur (val)
	 * @param val
	 */
	public void translate(double val) {
			abs += val;
	}
}
