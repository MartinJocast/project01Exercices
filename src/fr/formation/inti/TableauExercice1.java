package fr.formation.inti;

public class TableauExercice1 {

	public static void main(String[] args) {
		int n=10;
		final int p=5;
		int t1[]= {1, 3, 5};
		int t2[]= {n-1, n, n+1};
		int t3[]= {p-1, p, p+1}; 
		int t4[]; // on ne peut pas affecter des valeurs au tableau de cette manière. Il faut l'écrire sous cette forme: int t4[] = {1, 3, 5};
		// t4[] = {1, 3, 5};
		float x1[] = {1, 2, p, p+1};
		// float x2[] = {1.25, 2.5, 5}; //Ne fonctionne pas car on ne peut pas mettre de double dans du float. Il faut SOIT remplacer "float" par "double", SOIT remplacer "1.25, 2.5" par "1.25f, 2.5f"
		double x3[] = {1, 2.5, 5.25, 2*p};
		
	}
}
