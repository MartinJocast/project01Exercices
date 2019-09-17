package fr.formation.inti;

public class S2Exercice2 {

	public static void main(String[] args) {
		byte b1=10, b2=20;
		short p=200;
		int n=500;
		long q=100;
		float x=2.5f;
		double y=5.25;
		
		int r1=b1+b2;
		System.out.println(r1); //1: 30
		int r2=p+b1;
		System.out.println(r2); //2: 210
		int r3=b1*b2;
		System.out.println(r3); //3: 200
		long r4=q+p*(b1+b2);
		System.out.println(r4); //4: 6100	
		float r5=x+q*n;
		System.out.println(r5); //5: 50002.5
		float r6=b1*q/x;
		System.out.println(r6); //6: 400.0
		double r7=b1*q*2./x;
		System.out.println(r7); //7 800.0
		float r8=b1*q*2.f/x;
		System.out.println(r8); //8 800.0
	}
}
