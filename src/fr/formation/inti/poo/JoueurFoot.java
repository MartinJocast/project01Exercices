package fr.formation.inti.poo;

public class JoueurFoot {

	// attributs
	private String nomJ;
	private String prenomJ;
	private int ageJ;
	private String nationalite;
	private String poste;
	protected ClubFoot club;
	
	// accesseurs (getters & setters)
	public String getNomJ() {
		return nomJ;
	}
	public void setNomJ(String nomJ) {
		this.nomJ = nomJ;
	}
	public String getPrenomJ() {
		return prenomJ;
	}
	public void setPrenomJ(String prenomJ) {
		this.prenomJ = prenomJ;
	}
	public int getAgeJ() {
		return ageJ;
	}
	public void setAgeJ(int ageJ) {
		this.ageJ = ageJ;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public ClubFoot getClub() {
		return club;
	}
	public void setClub(ClubFoot club) {
		this.club = club;
	}
	
	// constructeur avec attributs (parametrable)
	public JoueurFoot(String nomJ, String prenomJ, int ageJ, String nationalite, String poste, ClubFoot club) {
		super();
		this.nomJ = nomJ;
		this.prenomJ = prenomJ;
		this.ageJ = ageJ;
		this.nationalite = nationalite;
		this.poste = poste;
		this.club = club;
	}
	
	// constructeur par defaut
	public JoueurFoot() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "JoueurFoot [nomJ=" + nomJ + ", prenomJ=" + prenomJ + ", ageJ=" + ageJ + ", nationalite=" + nationalite
				+ ", poste=" + poste + ", club=" + club + "]";
	}
	
	
}
