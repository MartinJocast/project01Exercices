package fr.formation.inti.poo;

public class AppFoot {

	public static void main(String[] args) {

		// instanciation de stades
		StadeFoot pierreMauroy = new StadeFoot("Stade Pierre Mauroy", "Villeneuve d'Ascq", 50000, "2012", "Losc");
		StadeFoot matmutAtlantique = new StadeFoot();
		// instanciation de clubs
		ClubFoot losc = new ClubFoot("LOSC", "Lille", "1944", pierreMauroy);
		ClubFoot girondins = new ClubFoot();
		ClubFoot ol = new ClubFoot("Olympique Lyonnais", "Lyon", null, null);
		ClubFoot psg = new ClubFoot("Paris Saint Germain", "Paris", "1970", null);
		ClubFoot om = new ClubFoot("Olympique de Marseille", "Marseille", null, null);
		ClubFoot monaco = new ClubFoot("AS Monaco FC", "Monaco", null, null);

		// attribution de valeurs aux attributs de l'objet "matmutAtlantique"
		matmutAtlantique.setNomStade("Stade Matmut Atlantique");
		matmutAtlantique.setClub("Girondins de Bordeaux");
		matmutAtlantique.setVille("Bordeaux");
		matmutAtlantique.setDateInauguration("2015");
		matmutAtlantique.setCapacite(42000);

		// attribution de valeurs aux attributs de l'objet "girondins"
		girondins.setNomClub("Girondins de Bordeaux");
		girondins.setVille("Bordeaux");
		girondins.setDateCreation("1881");
		girondins.setStade(matmutAtlantique);

		System.out.println("La capacité du " + pierreMauroy.getNomStade() + " est " + pierreMauroy.getCapacite());
		System.out.println("La date de création des " + girondins.getNomClub() + " est " + girondins.getDateCreation());

		double rempLoscPsg = StadeFoot.remplissage(36451, pierreMauroy.getCapacite());
		System.out.println("Le taux de remplissage de LOSC-PSG etait de " + rempLoscPsg + " %");

		System.out.println(matmutAtlantique);
		System.out.println(girondins);

		System.out.println(girondins.stade.getNomStade());
		
		
		// instanciation de joueurs
		JoueurFoot joueurPepe = new JoueurFoot("Pepe", "Nicolas", 24, "Ivoirien", "Attaquant", losc);
		JoueurFoot joueurBamba = new JoueurFoot("Bamba", "Jonathan", 23, "Francais", "Attaquant", losc);
		
		System.out.println(joueurPepe);
				
		// creation d'un tableau contenant tous les clubs de ligue 1
		ClubFoot[] clubsL1 = new ClubFoot[6];
		clubsL1[0] = girondins;
		clubsL1[1] = losc;
		clubsL1[2] = ol;
		clubsL1[3] = psg;
		clubsL1[4] = om;
		clubsL1[5] = monaco;
		
		// for each : affichage des clubs de ligue 1 (objets)
		for (ClubFoot cl : clubsL1) {
			System.out.println(cl);
		}

	}
}
