package fr.formation.inti;

public class Exercice2 {

	public static void main(String[] args) {
		int a=5, b=2, i, j;
		boolean k;
		j=3*(i=a+b);
		System.out.println("j = "+j);
		i*=7;
		System.out.println("i = "+i);
		j%=3;
		System.out.println("j = "+j);
		i*=j+=2;
		System.out.println("i = "+i);
		i=a+ ++b;
		System.out.println("i = "+i);
		// on réinitialise les valeurs des variables a et b car elles ont été modifiées pas l'action précédente
		a=5;
		b=2;
		i=a++ +b;
		System.out.println("i = "+i);
		a=5;
		b=2;
		i=a+++b;
		System.out.println("i = "+i);
		a=5;
		b=2;
		// k est vrai si a=7 et b<>2
		k= a==7 && b!=2;
		System.out.println("k = "+k);
		// k est vrai si a est <=5 Ou b est >2
		k= ((a<=5) || (b>2));
		System.out.println("k = "+k);
		// k est vrai si a=5 ou b=0
		k= a==5 || b==0;
		System.out.println("k = "+k);
		// k est vrai si 0<a<100<b
		k= 0<a && a<100 && 100<b;
		System.out.println("k = "+k);
	}
}
