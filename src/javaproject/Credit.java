package javaproject;

import java.time.LocalDate;

public class Credit {
	private int codeCredit;
	private CompteCourant cc;
	private Date dateVersement;
	private double montantCredit;
	private double frais;
	private final double p1 = 0.01;
	private final double p2 = 0.02;
	private final double p3 = 0.03;
	private boolean autorise = false;

	public Credit(int codeCredit, CompteCourant cc, Date dateVersement, double montantCredit) {
		this.codeCredit = codeCredit;
		this.cc = cc;
		this.dateVersement = dateVersement;
		this.montantCredit = montantCredit;
	}

	public Credit() {
		this.codeCredit = 0;
		this.cc = new CompteCourant();
		this.dateVersement = new Date();
		this.montantCredit = 0.0;
	}

	public void affiche() {
		System.out.println(toString());
	}

	public String toString() {
		return "Credit [codeCredit=" + codeCredit + ", compte courant =" + cc + ", dateVersement=" + dateVersement
				+ ", montantCredit=" + montantCredit + "]";
	}

	public boolean getAutorise() {
		return autorise;
	}

	public void setAutorise(boolean autorise) {
		this.autorise = autorise;
	}

	public void setautoriseCredit() {
		Date dateCreat = cc.getDateCreation();
		LocalDate dateJour = java.time.LocalDate.now();
		if (dateJour.getYear() - dateCreat.getAn() <= 1)
			autorise = true;
		else if (dateJour.getMonthValue() - dateCreat.getM() <= 6)
			autorise = true;

	}

	public void fraisDossier() {
		Employe titulaire = cc.getTitulaire();
		int age = titulaire.getAge();
		if (age < 30)
			frais = p1 * montantCredit;
		else if (age < 50)
			frais = p2 * montantCredit;
		else
			frais = p3 * montantCredit;
	}

	public void versementCredit() {
		cc.versement(montantCredit);
	}

}
