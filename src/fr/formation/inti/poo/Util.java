package fr.formation.inti.poo;

public class Util {
	
	public static int fonctiondAckermann (int m, int n) {
		if(m<0 || n<0) {
			return 0;
		}
		else {
			if(m==0) {
				return n+1;
			}
			else {
				if(n==0) {
					return fonctiondAckermann(m-1, 1);
				}
				else {
					return fonctiondAckermann(m-1, fonctiondAckermann(m, n-1));
				}
			}
		}
	}
}
