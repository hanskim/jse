package oop02_Syntex;

public class AverageD {
	public static void main(String[] args) {
		
		AverageService service = new AverageService();
	
		service.Input("��ũ",95,73);
		
		System.out.println("========"+service.getName()+ "�� ����ǥ========");
		System.out.println("���� :" + service.getKor());
		System.out.println("���� :"+service.getEng());
		System.out.println("���� :" +service.getTotal() );
		System.out.println("��� :" +service.getAverage() );
	}
	}
	
