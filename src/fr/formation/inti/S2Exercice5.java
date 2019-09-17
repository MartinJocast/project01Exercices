package fr.formation.inti;

public class S2Exercice5 {

	public static void main(String[] args) {
		int a, b=3, c=4, d=2, i=3, n=10, p=5, x=2, y=10;
		
		a= x+5; //1
		System.out.println(a); 
		a= x=y + 2; //2
		System.out.println(a);
		a= x=y+2; //3
		System.out.println(a);
		System.out.println(a<b && c<d); //4
		System.out.println(i++ * (n+p)); //5
		x += n%p; //6
		System.out.println(x);
		n= p+=5; //7
		System.out.println(n);
		
	}
}
