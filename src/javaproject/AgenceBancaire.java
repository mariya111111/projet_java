package javaproject;

public class AgenceBancaire {
	private int code;
	private String nomban;
	private String adresse;
	protected Date datelan;

	public void affiche() {
		System.out.println("Code: " + code + ", Nom du banque : " + nomban + ", Adresse: " + adresse
				+ ", date de lancement ;" + datelan.toString());
	}

	public String toString() {
		return "Code: " + code + ", Nom: " + nomban + ", Adresse: " + adresse + ", Date de lancement: "
				+ datelan.toString();
	}

	public AgenceBancaire() {

	}

	public AgenceBancaire(int code, String nomban, String adresse, Date datelan) {
		this.code = code;
		this.nomban = nomban;
		this.adresse = adresse;
		this.datelan = datelan;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNomban() {
		return nomban;
	}

	public void setNomban(String nomban) {
		this.nomban = nomban;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDatelan() {
		return datelan;
	}

	public void setDatelan(Date datelan) {
		this.datelan = datelan;
	}

}
