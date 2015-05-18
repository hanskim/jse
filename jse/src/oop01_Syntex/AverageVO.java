package oop01_Syntex;

public class AverageVO {

	private String name;
	private int kor;
	private int eng;
	private int total;
	private double average;

	public int getTotal() {
		total = this.kor + this.eng;
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		average = this.total / 2d;
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

}
