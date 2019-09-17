package fr.formation.inti.heritage;

public class Point {

	// attributs
	private int x, y;

	// Constructeur
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Constructeur par defaut
	public Point () {
	}
	
	
	public void affCoord() {
		System.out.println("Coordonnees : " + x + " " + y);
	}
	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}
	
	public void initialise (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void deplace (int dx, int dy) {
		x += dx;
		y += dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}	
	
}
