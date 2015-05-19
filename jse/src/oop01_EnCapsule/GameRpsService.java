package oop01_EnCapsule;

/*Date : 2015.05.15
 * Author : 김한식 , 
 * Description : 가위바위보 게임
 * 1 = 가위. 2= 바위. 3 = 보 
 * 
 */

public class GameRpsService {

	// 숫자값에 따른 가위, 바위, 보 경로로직
	public void ErrorMsg1(int playerValue) {
		System.out.println("잘못입력하셨습니다. 재입력 필!!");
	}

	public void ErrorMsg2(int playerValue) {
		System.out.println("입력오류 : 숫자를 입력하세요!");
	}

	public int ShowComValue() {
		return (int) ((Math.random() * 10) % 3) + 1; // 컴퓨터의 1~3까지 임의수 리턴
		                                             // 또는 (int) Math.random()*3 +1
	}

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
		
		/* switch (playerValue -comValue)
		 * String msg = "";   
		 * case 0 : break ;
		 * case 1 : -2 break ;
		 * 이러한 방식으로도 구현 가능  ...
		 */
		return msg;
	}

}
