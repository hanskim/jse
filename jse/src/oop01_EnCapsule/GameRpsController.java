package oop01_EnCapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {

		boolean flag = true;
		GameRpsService service = new GameRpsService();
		
		while (flag) {
			System.out.println("���������������� �����մϴ�.");
			System.out.println("���� :1 , ���� :2 , �� :3 �� �ϳ��� �Է� �ϼ���!:");
			Scanner scanner = new Scanner(System.in);
			int PlayerValue = scanner.nextInt();
			int ComValue = service.ShowComValue();

			if (PlayerValue > 3 || PlayerValue < 0) {
				service.ErrorMsg1(PlayerValue);
			} else if (PlayerValue == 0) {
				System.out.println("��������");
				break;
			} else if(1<=PlayerValue && PlayerValue <=3){
				System.out.println("����� " + service.ShowRpsValue(PlayerValue)
						+ "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� " + service.ShowRpsValue(ComValue)
						+ "�� �½��ϴ�.");
				System.out.println("���ӽ��ڴ�: "
						+ service.ShowWiner(PlayerValue, ComValue)+"�Դϴ�.");
			}else{
			service.ErrorMsg2(PlayerValue); // char�Է� �޾����� ���� ���� ��� �𸣰���.!!
		}
	}
	
}
}
