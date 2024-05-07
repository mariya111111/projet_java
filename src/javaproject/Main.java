package javaproject;

import java.time.LocalDate;


public class Main {
	public static void main(String args[]) {

		Date dateNais = new Date(13, 5, 1982);
		Date dateEmb = new Date(1, 3, 2018);
		Employe salem = new Employe("Salem", dateNais, dateEmb,"C",1500.0);
		System.out.println("\nInformations de la personne :");

		     System.out.println("Prénom : " + salem.getPrenom());
		     System.out.println("Date de naissance : " + salem.getDateNais());
	         System.out.println("Date d'embauche  : " + salem.getDateEmb());
	         System.out.println("Situation   : " + salem.getSituation());
		     System.out.println(" Salaire = : " + salem.getSalaire());
		     System.out.println(salem.getSituation());
		     int anciennete = salem.anciennete();
		     System.out.println("\nAncienneté de Salem : " + anciennete + "ans");
		     salem.changerSituation();
		     double prime=salem.prime();
		     System.out.println("les primes d'ancienneté :"+prime+ " dinars");
		     
	    Date dateLan = new Date(25, 12, 2015);
		AgenceBancaire agence = new AgenceBancaire(24, "Biat", "Sfax", dateLan);
		System.out.println("Détails de l'agence bancaire :");
               agence.affiche();
               
                Date dateCreation = new Date(1, 1, 2022);
		CompteCourant cc = new CompteCourant(salem, "12854", 0.0, agence,dateCreation, 0.0D);
		      System.out.println("Informations du compte courant :");
		      cc.affiche();    
		CompteEpargne ce = new CompteEpargne(salem, "95147", 0.0, agence,dateCreation  );
		      System.out.println("\nInformations du compte d'épargne :");
		      ce.affiche();

		for (int m = 1; m <= 12; m++) {
			LocalDate d1 = java.time.LocalDate.now();
			AgenceBancaire agenceOp = new AgenceBancaire(24, "Biat", "Sfax", dateLan);
			Operation op1=new Operation( d1, 'V', 1500.0D, agenceOp);
			cc.faireOP(op1);
			Operation op2=new Operation( d1, 'R', 500.0D, agenceOp);
			cc.faireOP(op2);
			Operation op3=new Operation( d1, 'V', 350.0D, agenceOp);
			ce.faireOP(op3);	
			cc.appliquerFB();
			ce.appliquerFrais();
		}
			for (int m = 1; m <= 12; m++) {
			LocalDate d2 = java.time.LocalDate.now();
			AgenceBancaire agenceOp = new AgenceBancaire(24, "Biat", "Sfax", dateLan);
			Operation op4=new Operation( d2, 'R', 400.0D, agenceOp);
			cc.faireOP(op4);
			  switch(m) {case 3,5,7,9,11: ce.retrait(300);
			     break;
			  }
			   cc.appliquerFB();
			ce.appliquerFrais();
			}	  
		
	    LocalDate dateJour = LocalDate.now();
		if (dateJour.getYear() == 2023) {
		    Date dateVersement = new Date(31, 1, 2023);
		    double montantCredit = 3 * cc.getTitulaire().getSalaire();
		    Credit cred= new Credit(1,cc,dateVersement,montantCredit );
		    cred.versementCredit();
		}
		
		 
		cc.affiche();
		System.out.println(" le compte courant:");
		ce.affiche();
		System.out.println(" le compte epargne:");
		
		System.out.println("Extrait bancaire de Compte Courant  :");
		cc.extrait();
		System.out.println("Extrait bancaire de Compte Courant  :");
		ce.extrait();
	
		
    
	
	
}
}
