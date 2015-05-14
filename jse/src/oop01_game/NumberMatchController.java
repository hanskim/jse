package oop01_game;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
		
		System.out.println("숫자맞추기 게임 : ");
		System.out.println("(총 3회만 입력 가능)");
		System.out.println(" 당신의 숫자(정수)를 입력하세요 : "); 
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		NumberMatchService service = new NumberMatchService();
		service.setInput(input) ;

	     

		
		
		
		
	}
	 
	 
	
}
