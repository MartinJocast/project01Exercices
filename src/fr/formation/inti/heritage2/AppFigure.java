package fr.formation.inti.heritage2;

public class AppFigure {

	public static void main(String[] args) {

		Triangle tr = new TriangleRectangle();
		tr.angle = 25;
		tr.coeff = 2;
		
		tr.affiche();
		tr.homothetie();
		tr.rotation();
	}
}
