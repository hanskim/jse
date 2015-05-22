package oop05_polymorphism;

import java.util.Scanner;

public class RpsMain {
	public static void main(String[] args) {

		boolean flag = true;
		RpsService service = new RpsServiceImpl();  // 반드시 이러한 패턴으로 구현할 것!!

		while (flag) {
			System.out.println("가위바위보게임을 시작합니다.");
			System.out.println("가위 :1 , 바위 :2 , 보 :3 중 하나를 입력 하세요!:");
			Scanner scanner = new Scanner(System.in);
			int PlayerValue = scanner.nextInt();
			int ComValue = service.ShowComValue();

			if (PlayerValue > 3 || PlayerValue < 0) {
				service.ErrorMsg1(PlayerValue);
			} else if (PlayerValue == 0) {
				System.out.println("게임종료");
				break;
			} else if (1 <= PlayerValue && PlayerValue <= 3) {
				System.out.println("당신은 " + service.ShowRpsValue(PlayerValue)
						+ "을 냈습니다.");
				System.out.println("컴퓨터는 " + service.ShowRpsValue(ComValue)
						+ "을 냈습니다.");
				System.out.println("게임승자는: "
						+ service.ShowWiner(PlayerValue, ComValue) + "입니다.");
			} else {
				service.ErrorMsg2(PlayerValue); // char입력 받았을대 오류 띄우는 방법 모르겠음.!!
			}
		}

	}

}
