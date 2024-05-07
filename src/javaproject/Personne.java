package javaproject;

import java.time.LocalDate;

public class Personne {
	private String nom;
	protected String prenom;
	private int CIN;
	private Date DateNais;

	public void affiche() {
		System.out.println(toString());
	}

	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Carte d'Identité nationale: " + CIN + ",Date de naissance"
				+ DateNais;
	}

	public Personne() {
	}

	public Personne(String nom, String prenom, int CIN, Date DateNais) {
		this.nom = nom;
		this.prenom = prenom;
		this.CIN = CIN;
		this.DateNais = DateNais;
	}

	public Personne(String prenom, Date DateNais) {
		this.prenom = prenom;
		this.DateNais = DateNais;
	}

	public void setNom(String n) {
		nom = n;
	}

	public String getNom() {
		return nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setCIN(int CIN) {
		this.CIN = CIN;
	}

	public int getCIN(int CIN) {
		return (CIN);
	}

	public Date getDateNais() {
		return DateNais;
	}

	public void setDateNais(Date dateNais) {
		DateNais = dateNais;
	}

	public int getCIN() {
		return CIN;
	}

	public int getAge() {
		LocalDate actuel = java.time.LocalDate.now();
		return actuel.getYear() - DateNais.getAn();
	}

}