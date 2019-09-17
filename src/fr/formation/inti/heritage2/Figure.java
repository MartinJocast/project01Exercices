package fr.formation.inti.heritage2;

public abstract class  Figure {

	// attributs : visibilite protected pour qu'ils soient visibles par les classes filles
	protected double coeff;
	protected double angle;
	
	// methode affiche
	public abstract void affiche();
	
	// methode homothetite : affiche le double du coefficient
	public void homothetie() {
		System.out.println(coeff*2);
	}
	
	// methode rotation : affiche le double de l'angle
	public void rotation() {
		System.out.println(angle*2);
	}
}
