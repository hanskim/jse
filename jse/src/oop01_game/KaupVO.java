package oop01_game;

public class KaupVO {

	private double height, weight;
	private int idx;
	private String msg;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getIdx() {
		return idx;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg() {
		System.out.println("vo내부 메세지(1)" + this.msg);
		if (idx > 30) {
			this.msg = "비만";
		} else if (idx > 24) {
			this.msg = "과체중";
		} else if (idx > 20) {
			this.msg = "정상";
		} else if (idx > 17) {
			this.msg = "저체중";
		} else if (idx > 13) {
			this.msg = "마름";
		} else if (idx > 10) {
			this.msg = "영양실조";
		} else {
			this.msg = "소모증";
		}
		// System.out.println("vo내부 메세지(2)" + this.msg);

	}

	public void setIdx(double weight, double height) {
		this.idx = (int) ((weight / (height * height) * 10000));
		// System.out.println("vo 내부 인덱스"+this.idx);
	}

	@Override
	public String toString() {
		return " 카우프지수 [키 =" + height + "cm , 몸무게=" + weight + "kg 카우프지수= "
				+ getMsg() + "]";
	}

}
