package fr.formation.inti;

public class TableauExercice6 {

	public static void main(String[] args) {
	int tableau[] = {14,15,78,54};
	valeurs(tableau);
	}
	
	/**
	 *  methode statique qui renvoie les valeurs d'un tableau d'entiers (int) reçu en argument
	 * @param tab
	 * @return
	 */
	public static void valeurs(int tab[]) {
		for(int v: tab) {
			System.out.println(v);
		}
	}
}
