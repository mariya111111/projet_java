package javaproject;

public class DateTime extends Date {
	private int h;
	private int min;
	private int s;

	public DateTime() {
		super();
	}

	public DateTime(int j , int m , int an ,int h, int min, int s) {
		super(j,m,an);
		this.h = h;
		this.min = min;
		this.s = s;
	}

	public String toString() {
		return super.toString() + h + ":" + min+":"+ s;
	}
	public void affiche() {
		super.affiche();
		System.out.println(toString());
	}

	public void seth(int h) {
		this.h = h;
	}

	public int geth(int h1) {
		return (h);
	}

	public void setmin(int min) {
		this.min = min;
	}

	public int getmin(int min1) {
		return (min);
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getS(int s1) {
		return (s);
	}

}
