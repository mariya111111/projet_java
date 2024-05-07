package javaproject;

public class CompteCourant extends Compte {
	protected double plafond;
	protected final double tauxFraisMois = 0.02;
	protected final int fraisBanq = 20;

	public void affiche() {
		super.affiche();
		System.out.println(toString());
	}

	public String toString() {
		return super.toString() + "CompteCourant [plafond=" + plafond + ", tauxFrais=" + tauxFraisMois + ", fraisBan="
				+ fraisBanq + "]";
	}

	public CompteCourant() {
		super();
		this.plafond = 0.0;
	}

	public CompteCourant(Employe titulaire, String numCompte, double solde, AgenceBancaire agence, Date dateCreation,
			double plafond) {
		super(titulaire, numCompte, solde, agence, dateCreation);
		this.plafond = plafond;
	}

	public CompteCourant(Employe titulaire, String numCompte, Date dateCreation, double plafond) {
		super(titulaire, numCompte, dateCreation);
		this.plafond = plafond;
	}

	public void retrait(double montant) { // setSolde
		if (solde >= montant)
			solde -= montant;
		else {
			double depassement = montant - solde; // nchouf 9adeh depassement li bch n3amlo
			double plafond = titulaire.getSalaire(); // nara salaire

			if (depassement <= plafond) {
				double frais = depassement * tauxFraisMois;
				System.out.println("vous avez un frais de :" + frais);
				solde = solde - frais;
			} else
				System.out.println("plafond est dépassé");

		}

	}

	public void appliquerFB() {
		retrait(fraisBanq * 3);
		System.out.println("les frais bancaire trimestriel retiré ");
	}
}