package oop05_polymorphism;

import java.util.Scanner;

import oop01_EnCapsule.KaupVO;

public class CopyOfKaupMain {
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 키를 입력하세요 : ");
		double height = scanner.nextDouble();
		System.out.println(" 몸무게를 입력하세요 : ");
		double weight = scanner.nextDouble();
		
		KaupInterface kaup = new KaupService();
		kaup.getKaupIndex(height, weight);
		System.out.println("당신의 카우프지수는 :" + kaup.getKaupIndex(height, weight)+"입니다.");
		System.out.println("당신의 건강상태는 :  " + kaup.getResultMsg()+"입니다.");
		
		
		
	

	}

}
