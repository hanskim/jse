package oop01_EnCapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		
		RpsService service = new RpsService();
		
		System.out.println("가위바위보게임을 시작합니다.");
		System.out.println("가위 :1 , 바위 :2 , 보 :3 중 하나를 입력 하세요!:");
		Scanner scanner = new Scanner(System.in);
		int playerVal = scanner.nextInt();
		System.out.println("플레이어는 (가위)를 냈습니다.");	
		int comVal = service.DisplayComVal();
		System.out.println("컴퓨터는 는 (가위)를 냈습니다.");	
		
		String winner = service.ShowWinner();
		System.out.println("승리자는  (누구)입니다..");
		
		
		
	}

}
