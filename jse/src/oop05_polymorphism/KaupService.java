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
			msg = "비만";
		} else if (this.idx > 24) {
			msg = "과체중";
		} else if (this.idx > 20) {
			msg = "정상";
		} else if (this.idx > 17) {
			msg = "저체중";
		} else if (this.idx > 13) {
			msg = "마름";
		} else if (this.idx > 10) {
			msg = "영양실조";
		} else {
			msg = "소모증";
		}
		return msg;
	}
}
