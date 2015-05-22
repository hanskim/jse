package oop05_polymorphism;

public class KaupService implements KaupInterface {
	int idx;

	@Override
	public int getKaupIndex(double height, double weight) {
		this.idx = (int) ((weight / (height * height) * 10000));
		return idx;
	}

	
	@Override
	public String getResultMsg() {
		String msg ;
		if (this.idx > 30) {
			msg = "��";
		} else if (this.idx > 24) {
			msg = "��ü��";
		} else if (this.idx > 20) {
			msg = "����";
		} else if (this.idx > 17) {
			msg = "��ü��";
		} else if (this.idx > 13) {
			msg = "����";
		} else if (this.idx > 10) {
			msg = "�������";
		} else {
			msg = "�Ҹ���";
		}
		return msg;
	}
}
