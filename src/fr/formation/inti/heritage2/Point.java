package fr.formation.inti.heritage2;

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

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}	
}
