package fr.formation.inti;

public class UtilTab {

	public static void main(String[] args) {
		
		// Test
		System.out.println("test de methode somme");
		double tab[] = {12.5,12,9};
		double sum = somme(tab);
		System.out.println(sum);
		double tab2[] = incre(tab, 2);
		System.out.println("valeurs du tableau tab2");
		affichageD(tab2);
		
		// Test 2
		int tabImp[] = impairs(8);
		System.out.println("valeurs du tableau tabImp");
		affichageI(tabImp);
		
		int tabTest1[] = {12, 10, 4, 20}; int tabTest2[] = {5, 4, 25, 14};
		int tabSomme[] = sommeTab(tabTest1, tabTest2);
		System.out.println("valeurs du tableau tabSomme");
		affichageI(tabSomme);
		
	}	
	
	/**
	 * Methode statique qui fournit la somme des valeurs d'un tableau de reels (double)
	 * @param tab
	 * @return
	 */
	public static double somme(double tab[]) {
		double somme=0;
		for(double v: tab) {
			somme+=v;
		}
		return somme;
	}
	
	/**
	 * Methode statique qui incremente d'une valeur donnee toutes les valeurs d'un tableau de reels (double)
	 * @param tab
	 * @param inc
	 * @return
	 */
	public static double[] incre(double tab[], double inc) {
		double tabInc[] = new double[tab.length];
		for(int i=0; i<tab.length; i++) {
			tabInc[i] = tab[i] + inc;
		}
		return tabInc;
	}
	
	/**
	 * Methode statique qui renvoie les valeurs d'un tableau de reels (double) reçu en argument
	 * @param tab
	 * @return
	 */
	public static double affichageD(double tab[]) {
		for(double v: tab) {
			System.out.print(v+" ");
		}
		System.out.println();
		return -1;
	}
	
	/**
	 * Methode statique qui renvoie les valeurs d'un tableau d'entiers (int) reçu en argument
	 * @param tab
	 * @return
	 */
	public static int affichageI(int tab[]) {
		for(int v: tab) {
			System.out.print(v+" ");
		}
		System.out.println();
		return -1;
	}
	
	/**
	 * Methode qui genere un tableau des n premiers nombres impaires, avec n fourni en argument
	 * @param n
	 * @return
	 */
	public static int[] impairs(int n) {
		int imp[] = new int[n];
		for(int i=0; i<n; i++) {
			imp[i] = i*2+1;
		}
		return imp;
	}
	
	/**
	 * Methode qui reçoit en argument 2 vecteurs d'entiers (int) de meme taille et qui fournit en retour un tableau représentant la somme des 2 vecteurs
	 * @param tabA
	 * @param tabB
	 * @return
	 */
	public static int[] sommeTab(int tabA[], int tabB[]) {
		int tabSomme[] = {-1};
		if(tabA.length != tabB.length) {
			System.out.println("Les vecteurs en entree doivent etre de meme taille");
			
		}		
		else {
			int tabS[] = new int[tabA.length];
			for(int i=0; i<tabA.length; i++) {
				tabS[i] = tabA[i] + tabB[i];
			}
			tabSomme=tabS;
		}
		return tabSomme;
	}
	
	
	/**
	 * Methode statique qui renvoie les valeurs d'un tableau de chaines de caracteres (String) reçu en argument
	 * @param tab
	 * @return
	 */
	public static void affichageS(String tab[]) {
		for(String v: tab) {
			System.out.print(v+" ");
		}
		System.out.println();
	}
}
