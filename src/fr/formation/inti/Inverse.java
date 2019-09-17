package fr.formation.inti;

public class Inverse {

	public static void main(String[] args) {

		String chaine = "abcdefghijklmnopq";
		
		inverser(chaine);
		inverser2(chaine); // Methode beaucoup plus rapide
	}
	
	/**
	 * Methode qui permet d'inverser une chaine de caracteres et qui l'affiche a l'ecran
	 * @param chaine
	 */
	public static void inverser (String chaine) {
		int l = chaine.length();
		
		// stockage de la chaine de caractere inversee dans un tableau de char
		char [] inverse = new char[l];
		for(int i=0; i<((l+1)/2); i++) {
			inverse [i] = chaine.charAt(l-1-i);
			inverse [l-1-i] = chaine.charAt(i);
		}
		
		// affichage
		for(char c : inverse) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	/**
	 * Methode qui affiche a l'ecran une chaine inversee
	 * @param chaine
	 */
	public static void inverser2 (String chaine) {
		for(int i=chaine.length()-1; i>=0; i--) {
			System.out.print(chaine.charAt(i));
		}
		System.out.println();
	}
}
