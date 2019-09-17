package fr.formation.inti.heritage2;

public class PointNom extends Point{

	public char nom;
	
	public PointNom() {
		// TODO Auto-generated constructor stub
	}
	
	public PointNom(int x, int y, char nom) {
		super(x, y);
		this.nom = nom;
	}

	@Override
	public void affiche() {
		super.affiche();
		System.out.println(this.nom);
	}

	public char getNom() {
		return nom;
	}

	public void setNom(char nom) {
		this.nom = nom;
	}
	
}
