package fr.formation.inti.heritage;

public class AppPoint {

	public static void main(String[] args) {

		// instanciation de l'objet pnt à partir de la classe Point
		// on ne pourra pas utiliser la fonction affiche car elle n'appartient pas à la classe Point mais à sa classe fille PointA
		Point pnt = new Point();
		pnt.initialise(5, 9); 
		
		// instanciation de l'objet pnt1 à partir de la classe PointA
		PointA pnt1 = new PointA(); 
		pnt1.initialise(4, 12);
		
		// instanciation de l'objet pnt2 à partir de la classe Point
		// on ne pourra pas utiliser la fonction affiche car elle n'appartient pas à la classe Point mais à sa classe fille PointA
		Point pnt2 = new PointA(); 
		pnt2.initialise(6, 2);
		
		pnt1.affiche(); // utilisation de la methode affiche de la classe PointA
		pnt1.deplace(5, 4); // utilisation de la methode deplace de la classe Point (classe mere de PointA)
	
		// instanciation de l'objet pntNom à partir de la classe PointNom	
		PointNom pntNom = new PointNom(12, 28, "Point number 1");
		pntNom.affCoordNom();
		
		
		// instanciation de l'objet pntNom à partir de la classe PointNom	
		PointNom2 pntNom2 = new PointNom2(25, 31, "Point number 2");
		pntNom2.affiche();
	
	}
}
