package javaproject;

import java.time.LocalDate;

//import java.time.format.DateTimeFormatter;

public class Employe extends Personne {
	private String fonction;
	protected Date dateEmb;
	private String situation;
	protected double salaire;

	public Employe(String nom, String prenom, int CIN, Date DateNais, String fonction, Date dateEmb, String situation,
			double salaire) {
		super(nom, prenom, CIN, DateNais);
		this.fonction = fonction;
		this.dateEmb = dateEmb;
		this.situation = "C";
		this.salaire = salaire;
	}

	public Employe(String prenom, Date DateNais, Date dateEmb, String situation, double salaire) {
		super(prenom, DateNais);
		this.dateEmb = dateEmb;
		this.salaire = salaire;
		this.situation = situation;

	}

	public Employe() {
		super();
		this.fonction = "NULLE";
		this.dateEmb = new Date();
		this.situation = "C";
		this.salaire = 0.0;
	}

	public void affiche() {
		super.affiche();
		System.out.println("Fonction: " + fonction);
		System.out.println("Date d'embauche: " + dateEmb.toString());
		if (situation == "C")
			System.out.println("Situation: Contractuelle ");
		else 
			System.out.println("situation : Titulaire");
		System.out.println("Salaire: " + salaire);
	}

	public String toString() {
		String res = super.toString();
		res = res + " Fonction: " + fonction;
		res += ", Date d'embauche: " + dateEmb.toString();

		if (situation == "C")
			situation += "Situation: Contractuelle ";
		else 
			situation += "situation : Titulaire";

		situation += ", Salaire: " + salaire;

		return res;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Date getDateEmb() {
		return dateEmb;
	}

	public void setDateEmb(Date dateEmb) {
		this.dateEmb = dateEmb;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public int anciennete() {
		LocalDate actuel = java.time.LocalDate.now();
		return actuel.getYear() - dateEmb.getAn();
	}

	public void changerSituation() {
		int anc = anciennete();

		if (anc > 4) {
			situation = "T";
			System.out.println("situation modifiée au Titulaire");
		} else
			System.out.println("situation non modifiée ");
	}

	public double prime() {
		int anc = anciennete();
		if (anc >= 5)
			return 3 * salaire;
		else
			return 0;
	}

}
