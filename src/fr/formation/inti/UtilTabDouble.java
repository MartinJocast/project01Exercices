package fr.formation.inti;

public class UtilTabDouble {

	public static void main(String[] args) {
	
		// Test
		double tab1[][] = {{1, 5, 10},{4, 8, 5},{7, 2, 9}};
		double tab2[][] = {{3, 4, 7},{10, 7, 1},{3, 4, 15}};

		affiche(tab1);
		regulier(tab1);
		sommeLignes(tab1);
		somme(tab1, tab2);
	}

	
	/**
	 * Methode qui affiche les valeurs de t, à raison d'une ligne d'ecran pour une ligne de tableau
	 * @param t
	 * @return
	 */
	public static void affiche(double t[][]) {
		for(int i=0; i < t.length; i++) {
			for(double v: t[i]) {
				System.out.print(v+"  ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Methode qui teste si le tableau t est regulier: si toutes ses lignes ont la meme taille
	 * @param t
	 * @return
	 */
	public static boolean regulier(double t[][]) {
		boolean reponse = true;
		int lon= t[0].length;
		for(int i=1; i<t.length; i++) {
			if(t[i].length != lon) {
				reponse = false;
				break;
			}
		}
		// System.out.println("Le tableau est-il regulier? "+reponse);
		return reponse;
	}
	
	/**
	 * Methode qui fournit un tableau de double correspondant aux sommes des differentes lignes de t
	 * @param t
	 * @return
	 */
	public static double[] sommeLignes(double t[][]) {
		double tSomme[] = new double[t.length];
		for(int i=0; i < t.length; i++) {
			tSomme[i]=0;
			for(double v: t[i]) {
				tSomme[i]+=v;
			}
			System.out.println(tSomme[i]);
		}
		return tSomme;
	}
	
	/**
	 * Methode qui s'assure que les tableaux t1 et t2 sont réguliers et de memes dimensions et fournit dans ce cas leur somme en resultat
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static double[][] somme(double t1[][], double t2[][]) {
		double tSomme[][] = null;
		if(regulier(t1) && regulier(t2) && t1.length==t2.length && t1[0].length==t2[0].length) {
			for(int i=0; i < t1.length; i++) {
			tSomme = t1;
				for(int j=0; j<t1.length; j++) {
					tSomme[i][j] += t2[i][j];
				}
			}
		affiche(tSomme);
		}
		else {
			System.out.println("Les deux tableaux ne sont pas réguliers et/ou de memes dimensions");
		}
		return tSomme;
	}
}
