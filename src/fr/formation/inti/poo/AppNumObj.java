package fr.formation.inti.poo;

public class AppNumObj {

	public static void main(String[] args) {
		NumObj a = new NumObj();
		NumObj b = new NumObj();
		NumObj c = new NumObj();
		NumObj d = new NumObj();
		
		System.out.println(b.getIdent()); // ident = 2
		System.out.println(NumObj.getIdentMax()); // identMax = 4
		
		NumObj e = new NumObj();
		
		System.out.println(NumObj.getIdentMax()); // identMax = 5	
		
		NumObj2 obj1 = new NumObj2();
		NumObj2 obj2 = new NumObj2();
		
		System.out.println("numero initial de obj1 : "+obj1.getIdent());
		System.out.println(NumObj2.getIdentMax()); // identMax = 2
	}
}
