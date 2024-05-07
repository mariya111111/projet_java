package javaproject;


public class Date {
	private int j;
	private int m;
	private int an;

	public Date() {
		this.j = 0;
		this.m = 0;
		this.an = 0;
	} 

	public Date(int j, int m, int an) {
		this.j = j;
		this.m = m; 
		this.an = an;
	}

	public void affiche() {
		System.out.println("jour: " + j + ", mois: " + m + "année " + an);
	}

	public String toString() {
		return j + "/" + m + "/" + an;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}




}
