package javaproject;
import java.time.LocalDate;
public class Operation {
	protected LocalDate dateOperation;
	protected char type;
	protected double montant;
	protected AgenceBancaire agenceOperation;

	
    public Operation(LocalDate dateOperation, char type, double montant, AgenceBancaire agenceOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.agenceOperation = agenceOperation;
	}
	public void affiche() {
    	System.out.println(toString());
    }
	public String toString() {
		return "Operation [dateOperation=" + dateOperation.toString() + ", type=" + type + ", montant=" + montant
				+ ", agenceOperation=" + agenceOperation.toString() + "]";
	}

	public LocalDate getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(LocalDate dateOperation) {
		this.dateOperation = dateOperation;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public AgenceBancaire getAgenceOperation() {
		return agenceOperation;
	}

	public void setAgenceOperation(AgenceBancaire agenceOperation) {
		this.agenceOperation = agenceOperation;
	}
	

}
