package javaproject;

import java.time.LocalDate;

public abstract class Compte {
	protected Employe titulaire;
	private String numCompte;
	protected double solde = 0;
	private AgenceBancaire agence;
	private Date dateCreation;
	private final int frais = 15;
	private Operation[] Top;
	private final int nbMax = 1000;
	private static  int nbOP;

	public String toString() {
		return "Compte [titulaire=" + titulaire + ", numCompte=" + numCompte + ", solde=" + solde + ", agence=" + agence.toString()
				+ ", dateCreation=" + dateCreation.toString() + ",les frais chaque trimester" + frais + "]";
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void affiche() {
		System.out.println(toString());
	}

	public Employe getTitulaire() {
		return titulaire;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public Compte(Employe titulaire, String numCompte, double solde, AgenceBancaire agence, Date dateCreation) {
		this.titulaire = titulaire;
		this.numCompte = numCompte;
		this.solde = solde;
		this.agence = agence;
		this.dateCreation = dateCreation;
		Top = new Operation[nbMax];
		nbOP = 0;

	}

	public Compte(Employe titulaire, String numCompte, Date dateCreation) {
		this.titulaire = titulaire;
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		Top = new Operation[nbMax];
		nbOP = 0;
	}

	public Compte() {
		titulaire = new Employe();
		numCompte = "12345";
		solde = 0;
		agence = new AgenceBancaire();
		dateCreation = new Date();
		Top = new Operation[nbMax];
		nbOP = 0;
	}

	public void versement(double montant) {
		solde += montant;
	}

	public void extrait() {
		for (int i = 0; i < nbOP; i++) {
			Operation elet = Top[i];
			System.out.println(elet.toString());
		}
	}

	public abstract void retrait(double montant);

	public void faireOP(Operation op) {
		if (nbOP < nbMax) {
			if (op.getType() == 'V')
				versement(op.getMontant());
			else
				retrait(op.getMontant());

			LocalDate d1 = java.time.LocalDate.now();
			Top[nbOP] = new Operation(d1, op.getType(), op.getMontant(), agence);
			nbOP++;
		}
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	

}
