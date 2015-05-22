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
			result = "가위";
			break;
		case 2:
			result = "바위";
			break;
		case 3:
			result = "보";
			break;
		}
		return result;
	}
		


	@Override
	public String ShowWiner(int playerValue, int comValue) {
		
		String msg = "";

		if (playerValue == comValue) {
			msg = "없습니다.(비겼습니다).";

		} else if ((playerValue == 1 && comValue == 3)
				|| (playerValue == 2 && comValue == 1)
				|| (playerValue == 3 && comValue == 2)) {
			msg = "당신!!";
		} else {
			msg = "컴퓨터!!";
		}
		return msg;
	}
	
	public void ErrorMsg1(int playerValue){
		System.out.println("잘못입력하셨습니다. 재입력 필!!");
	}

	@Override
	public void ErrorMsg2(int playerValue) {
		System.out.println("잘못입력하셨습니다.숫자입력 필!!");
	}

}
