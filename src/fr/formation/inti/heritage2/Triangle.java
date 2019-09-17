package fr.formation.inti.heritage2;

public class Triangle implements IAffichable, ITransformable {
	
		
	public Triangle() {
	}
	public Triangle(double coeff, double angle) {
		this.coeff = coeff;
		this.angle = angle;
	}
	
	// implementation de la methode affiche de l'interface IAffichable
	@Override
	public void affiche() {
		System.out.println("Triangle");		
	}
	
	// attributs : visibilite protected pour qu'ils soient visibles par les classes filles
	protected double coeff;
	protected double angle;
	
	// implementation des methode homothetie et rotation de l'interface ITransformable
	@Override
	public void homothetie() {
		System.out.println(coeff*2);		
	}

	@Override
	public void rotation() {
		System.out.println(angle*2);
	}
}
