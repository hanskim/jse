package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchDemo {

	public static void main(String[] args) {
		
		int avg ; 
		Scanner scanner = new Scanner(System.in);
		avg = scanner.nextInt();
		
		
		/*

		do {
			System.out.println(" 평균접수입력 : ");
			avg = scanner.nextInt();
		}while(avg >= 100 || avg <0);
			String result = "";
        */
		
		/*
		if (avg >= 90) {
			result = "우수합격";
		} else if (avg >=80) {
			result = "일반합격";
		} else {
			result = "재시험";
		}
	 */
		
		
		//삼항연산자 test
		//result =  avg >=90 ?  "최우수합격" : (avg >= 80 ? "일반합격" :"불합격");
		//System.out.print(result);
		
	
		String grade ="";
		
		switch (avg) {
		case 9  :
			grade ="우수합격";
			break;
		case 8 :
			grade ="합격";
			break;
		default:
			grade ="불합격";
			break;
		}
		System.out.println("입력한 평균은 : " +avg + "점이며 당신은 " + grade + "입니다." );
			
		
		scanner.close();

	}
}
