package oop05_polymorphism;

import java.util.Scanner;

import oop01_EnCapsule.KaupVO;

public class CopyOfKaupMain {
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Ű�� �Է��ϼ��� : ");
		double height = scanner.nextDouble();
		System.out.println(" �����Ը� �Է��ϼ��� : ");
		double weight = scanner.nextDouble();
		
		KaupInterface kaup = new KaupService();
		kaup.getKaupIndex(height, weight);
		System.out.println("����� ī���������� :" + kaup.getKaupIndex(height, weight)+"�Դϴ�.");
		System.out.println("����� �ǰ����´� :  " + kaup.getResultMsg()+"�Դϴ�.");
		
		
		
	

	}

}
