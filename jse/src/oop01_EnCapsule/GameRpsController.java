package oop01_EnCapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {

		boolean flag = true;
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);

		while (flag) {
			System.out.println("가위바위보게임을 시작합니다.");
			System.out.println("가위 :1 , 바위 :2 , 보 :3 중 하나를 입력 하세요!:");

			int PlayerValue = scanner.nextInt();
			int ComValue = service.ShowComValue();

			if (PlayerValue > 3 || PlayerValue < 0) {
				service.ErrorMsg1(PlayerValue);
			} else if (PlayerValue == 0) {
				System.out.println("게임종료");
				break;
			} else {
				service.ErrorMsg2(PlayerValue); // char입력 받았을대 오류 띄우는 방법
			}

			System.out.println("당신은 " + service.ShowRpsValue(PlayerValue)
					+ "을 냈습니다.\n");
			System.out.println("컴퓨터는 " + service.ShowRpsValue(ComValue)
					+ "을 냈습니다.\n");
			System.out.println("게임승자는: "
					+ service.ShowWiner(PlayerValue, ComValue) + "입니다.");
		}
		scanner.close();
	}
}
