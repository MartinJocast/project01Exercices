package fr.formation.inti.poo;

public class Exercice5 {

	public static void main(String[] args) {

		Point2 a;
		a = new Point2(3, 5);
		System.out.println("abscisse a : " + a.abscisse());
		System.out.println("ordonnee a : " + a.ordonnee());

		a.deplace(2, 0);
		System.out.println("abscisse a : " + a.abscisse());
		System.out.println("ordonnee a : " + a.ordonnee());

		Point2 b = new Point2(6, 8);
		System.out.println("abscisse b : " + b.abscisse());
		System.out.println("ordonnee b : " + b.ordonnee());
	}
}

class Point2 {
	public Point2(int abs, int ord) {
		x = abs;
		y = ord;
	}
	public void deplace(int dx, int dy) {
		x += dx;
		y += dy;
	}

	// accesseurs
	public double abscisse() {
		return x;
	}
	public double ordonnee () {
		return y;
	}

	private double x; // abscisse
	private double y; // ordonnee
}