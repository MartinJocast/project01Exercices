package fr.formation.inti.poo;

public class AppPoint {

	public static void main(String[] args) {

		Point p1 = new Point('M', 9);
	
		p1.affiche();
		p1.translate(12.5);
		p1.affiche();
	}
}
