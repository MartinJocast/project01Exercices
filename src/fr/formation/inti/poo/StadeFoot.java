package fr.formation.inti.poo;

public class StadeFoot {
	
	// attributs
	private String nomStade;
	private String ville;
	private int capacite;
	private String dateInauguration;
	private String club;
	
	// constructeur par defaut
	public StadeFoot() {
		super();
	}

	// constructeur avec attributs  (parametrable)
	public StadeFoot(String nomStade, String ville, int capacite, String dateInauguration, String club) {
		super();
		this.nomStade = nomStade;
		this.ville = ville;
		this.capacite = capacite;
		this.dateInauguration = dateInauguration;
		this.club = club;
	}
	
	// accesseurs
	public String getNomStade() {
		return nomStade;
	}
	public void setNomStade(String nomStade) {
		this.nomStade = nomStade;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getDateInauguration() {
		return dateInauguration;
	}
	public void setDateInauguration(String dateInauguration) {
		this.dateInauguration = dateInauguration;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	public static double remplissage(int spectateurs, int capacite) {
		double remp;
		remp = (double) spectateurs/capacite *100;
		return remp;
	}

	@Override
	public String toString() {
		return "StadeFoot [nomStade=" + nomStade + ", ville=" + ville + ", capacite=" + capacite + ", dateInauguration="
				+ dateInauguration + ", club=" + club + "]";
	}
	
	
}
