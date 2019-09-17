package fr.formation.inti.heritage2;

public class Cercle extends Point {

	// attributs
	private int  rayon;
	
	// constructeur
	public Cercle(int xCentre, int yCentre, int rayon) {
		super(xCentre,yCentre);
		this.rayon = rayon;
	}
	
	// modifie les coordonnées du centre du cercle
	public void deplaceCentre(int newXCentre, int newYCentre) {
		super.initialise(newXCentre, newYCentre);
	}
	
	// modifie le rayon du cercle
	public void changeRayon(int newRayon) {
		rayon = newRayon;
	}
	
	// fournit en résultat un objet de type Point correspondant au centre du cercle
	public Point getCentre() {
		Point p = new Point(super.getX(), super.getY());
		return p;
	}

	// Redéfinition de la méthode affiche de la classe mere Point
	public void affiche() {
		getCentre().affiche();	
		System.out.println("Rayon : "+rayon);
	}
}
