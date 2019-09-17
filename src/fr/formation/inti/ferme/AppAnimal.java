package fr.formation.inti.ferme;

public class AppAnimal {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.affichage();
		Animal rex = new Chien();
		rex.affichage();
		Animal garfield = new Chat();
		garfield.affichage();
		Animal rogerRabbit = new Lapin();
		rogerRabbit.affichage();
	
		
		Animal[] animaux = new Animal[4];
		animaux[0] = a;
		animaux[1] = rex;
		animaux[2] = garfield;
		animaux[3] = rogerRabbit;
	
		for(Animal c: animaux) {
			c.affichage(); // grace au polymorphisme
		}
	}
}
