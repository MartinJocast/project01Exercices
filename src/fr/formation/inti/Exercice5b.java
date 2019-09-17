package fr.formation.inti;

public class Exercice5b {

	public static void main(String[] args) {
		diagonal();
	}

	public static void diagonal() {
		char lettre='A';
		String espI="";
		for(int i=1; i<=10; i++, espI+="  ") {
			System.out.println(espI+lettre++);
		}
	}
}
