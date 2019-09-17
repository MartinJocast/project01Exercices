package fr.formation.inti.heritage2;

public class Cercle2 {

	// attributs
	private int rayon;
	private Point p;
	
	// constructeur
	public Cercle2(int xCentre, int yCentre, int rayon) {
		this.p = new Point(xCentre, yCentre);
		this.rayon = rayon;
	}	
	
	// Getters & setters
	public int getRayon() {
		return rayon;
	}
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}

	// modifie les coordonnées du centre du cercle
	public void deplaceCentre(int newXCentre, int newYCentre) {
		p.initialise(newXCentre, newYCentre);
	}
	
	// modifie le rayon du cercle
	public void changeRayon(int newRayon) {
		rayon = newRayon;
	}
	
	// fournit en résultat un objet de type Point correspondant au centre du cercle
	public Point getCentre() {
		return p;
	}

	// affiche les coordonnees du point p et le rayon
	public void affiche() {
		p.affiche();
		System.out.println("Rayon : "+rayon);
	}
}
