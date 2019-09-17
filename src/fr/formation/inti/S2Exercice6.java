package fr.formation.inti;

public class S2Exercice6 {

	public static void main(String[] args) {
		byte b; short p; int n; long q;
		final int N=10;
		float x; double y;
		
		// b=n; INCORRECT car byte ne peut contenir int --> CONVERSION: il faut rajouter (byte) devant n, à condition que n soit compris entre les bornes {-128; 127}
		// b=25; CORRECT
		// b=500; INCORRECT car la valeur 500 n'est pas comprise dans l'intervalle {-128; 127} et ne peut être enregistrée dans un byte --> il faut stocker cette valeur dans une nouvelle variable de type autre que byte
		// x=2*q; CORRECT
		// y=b*b; CORRECT
		// p=b*b; INCORRECT car le format du résultat d'une opération est int --> CONVERSION:il faut rajouter (int) devant b*b
		// b=b+5; INCORRECT car le format du résultat d'une opération est int --> CONVERSION:il faut rajouter (int) devant b+5
		// p=5*N-3; CORRECT
		
	}
}
