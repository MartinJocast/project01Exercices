package fr.formation.inti;

import java.util.Scanner;

public class TableauExercice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Combien de valeurs :");
		int n = sc.nextInt();
		int tabCarre[] = new int[n];
		int val;

		for (int i = 0; i < n; i++) {
			val = 2 * i + 1;
			tabCarre[i] = val * val;
			System.out.println(val + " a pour carre " + tabCarre[i]);
		}
		sc.close();
	}
}
