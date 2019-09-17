package fr.formation.inti.poo;

public class ClubFoot {
	
	// attributs
	private String nomClub;
	private String ville;
	private String dateCreation;
	public StadeFoot stade;
	
	
	// constructeur par defaut
	public ClubFoot() {
		super();
	}

	// constructeur avec attributs (parametrable)
	public ClubFoot(String nomClub, String ville, String dateCreation, StadeFoot stade) {
		super();
		this.nomClub = nomClub;
		this.ville = ville;
		this.dateCreation = dateCreation;
		this.stade = stade;
	}
	
	// accesseurs
	public StadeFoot getStade() {
		return stade;
	}
	public void setStade(StadeFoot stade) {
		this.stade = stade;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "ClubFoot [nomClub=" + nomClub + ", ville=" + ville + ", dateCreation=" + dateCreation + ", stade="
				+ stade + "]";
	}
	
	
	
	
}
