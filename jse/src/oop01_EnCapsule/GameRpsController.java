package oop01_EnCapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("가위바위보게임을 시작합니다.");
		System.out.println("가위 :1 , 바위 :2 , 보 :3 중 하나를 입력 하세요!:");
		Scanner scanner = new Scanner(System.in);
		
		GameRpsService service = new GameRpsService();
		int PlayerValue = scanner.nextInt();
		service.ShowComValue();
		
		System.out.println("당신은 " + PlayerValue + "을 냈습니다.\n");
		System.out.println("컴퓨터는 " + service.ShowComValue() + "을 냈습니다.\n");
		//System.out.println("승자는 " +   +"입니다." );
		
	   

		
		
		
	}

}
