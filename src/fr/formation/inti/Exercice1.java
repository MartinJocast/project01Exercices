package fr.formation.inti;

public class Exercice1 {

	public static void main(String[] args) {
		int i, j=3, k=5;
		double d, e=1.5, f=2.3;
		char car='A';
		i=k/j;
		System.out.println("i = k/j = "+i);
		i=k%j;
		System.out.println("i = k%j = "+i);
		i=(k/j)+(k%j);
		System.out.println("i = k/j + k%j = "+i);
		d=f/e;
		System.out.println("d = f/e = "+d);
		d=(j/e)+(k/f);	
		System.out.println("d = j/e + k/f = "+d);
		d=(f/e)+(k/j);
		System.out.println("d = f/e + k/j = "+d);
		i=(int) ((j/e)+(k/f));
		System.out.println("i = j/e + k/f = "+i);
		i=(int) ((f/e)+(k/j));
		System.out.println("i = f/e + k/j = "+i);
		car=(char) (car+1);
		System.out.println("car = "+car);
		i=car+2;
		System.out.println("i = "+i);
		car='B'+('a'-'A');
		System.out.println("car = "+car);
	}
}
