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
		System.out.println("vo���� �޼���(1)" + this.msg);
		if (idx > 30) {
			this.msg = "��";
		} else if (idx > 24) {
			this.msg = "��ü��";
		} else if (idx > 20) {
			this.msg = "����";
		} else if (idx > 17) {
			this.msg = "��ü��";
		} else if (idx > 13) {
			this.msg = "����";
		} else if (idx > 10) {
			this.msg = "�������";
		} else {
			this.msg = "�Ҹ���";
		}
		// System.out.println("vo���� �޼���(2)" + this.msg);

	}

	public void setIdx(double weight, double height) {
		this.idx = (int) ((weight / (height * height) * 10000));
		// System.out.println("vo ���� �ε���"+this.idx);
	}

	@Override
	public String toString() {
		return " ī�������� [Ű =" + height + "cm , ������=" + weight + "kg ī��������= "
				+ getMsg() + "]";
	}

}
