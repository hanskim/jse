package oop01_game;

public class KaupVO {
	
	private double height , weight ,idx;
	
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
	
	public KaupVO(double i, double j) {
		this.height = i;
		this.weight = j;
		this.idx = (int) (weight/(Math.pow(height, 2)) * 10000);
	}
	
	String getMsg() {
		String msg = "";
		if (idx > 30) {
			msg = "��";
		} else if (idx > 24) {
			msg = "��ü��";
		} else if (idx > 20) {
			msg = "����";
		} else if (idx > 15) {
			msg = "��ü��";
		} else if (idx > 13) {
			msg = "����";
		} else if (idx > 10) {
			msg = "�������";
		} else {
			msg = "�Ҹ���";
		}
		return msg;
	}

	@Override
	public String toString() {
		return " ī�������� [Ű =" + height + "cm , ������=" + weight + "kg ī��������= "
				+ getMsg() + "]";
	
	}
}
