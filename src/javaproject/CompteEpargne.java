package javaproject;

public class CompteEpargne extends Compte {
	protected final double tauxBenefice = 0.06;

	public void affiche() {
		super.affiche();
		System.out.println(toString());
	}

	public String toString() {
		return super.toString() + "CompteEpargne [tauxBenefice=" + tauxBenefice + "]";
	}

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(Employe titulaire, String numCompte, double solde, AgenceBancaire agence, Date dateCreation) {
		super(titulaire, numCompte, solde, agence, dateCreation);
	}
	
	public void retrait(double montant) {
		if (solde >= montant)
			solde -= montant;
		else
			System.out.println("solde insuffisant");
	}
	
	public void appliquerFrais() {
		solde += solde * tauxBenefice;
	}

}
