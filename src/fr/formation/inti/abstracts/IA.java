package fr.formation.inti.abstracts;

public interface IA {

	public void test();
	public void test2();
	
	// 2 exeptions:
	// comportement par defaut de cette methode
	public default void test3() {
		System.out.println("exemple default");
	}

	// methode static doit aussi avoir un corps
	public static void test4() {
		System.out.println("exemple static");
	}
	
	public void create();
	public void read();
	public void update();
	public void delete();

}
