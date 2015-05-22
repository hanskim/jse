package oop05_polymorphism;

public class RpsServiceImpl implements RpsService {
	
	int ComValue;
	
	@Override
	public int ShowComValue() {
		this.ComValue = (int) ((Math.random() * 10) % 3) + 1;
		return  ComValue ;
	}

	@Override
	public String ShowRpsValue(int playerValue) {
		String result = "";
		
		switch (playerValue) {
		case 1:
			result = "����";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��";
			break;
		}
		return result;
	}
		


	@Override
	public String ShowWiner(int playerValue, int comValue) {
		
		String msg = "";

		if (playerValue == comValue) {
			msg = "�����ϴ�.(�����ϴ�).";

		} else if ((playerValue == 1 && comValue == 3)
				|| (playerValue == 2 && comValue == 1)
				|| (playerValue == 3 && comValue == 2)) {
			msg = "���!!";
		} else {
			msg = "��ǻ��!!";
		}
		return msg;
	}
	
	public void ErrorMsg1(int playerValue){
		System.out.println("�߸��Է��ϼ̽��ϴ�. ���Է� ��!!");
	}

	@Override
	public void ErrorMsg2(int playerValue) {
		System.out.println("�߸��Է��ϼ̽��ϴ�.�����Է� ��!!");
	}

}
