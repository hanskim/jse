package oop02_Syntex;

public class AverageA {
	
	String name ; 
	int kor ; 
	int eng ; 
	

	public static void main(String[] args) {
		
		AverageA avg1 = new AverageA();
		
		int total ; 
		double average ; 
		
		avg1.name ="��ũ " ; 
		avg1.kor = 95; 
		avg1.eng = 45; 
		total = avg1.kor +avg1.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg1.name +"�� ����ǥ "+ "========");
		System.out.println( "���� :" +avg1.kor );
		System.out.println( "���� :" +avg1.eng );
		System.out.println( "���� :" +total );
		System.out.println( "��� :" +average );
	
		avg1.name ="���̾�� " ; 
		avg1.kor = 75; 
		avg1.eng = 85; 
		total = avg1.kor +avg1.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg1.name +"�� ����ǥ "+ "========");
		System.out.println( "���� :" +avg1.kor );
		System.out.println( "���� :" +avg1.eng );
		System.out.println( "���� :" +total );
		System.out.println( "��� :" +average );
	
		avg1.name ="�丣 " ; 
		avg1.kor = 85; 
		avg1.eng = 65; 
		total = avg1.kor +avg1.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg1.name +"�� ����ǥ "+ "========");
		System.out.println( "���� :" +avg1.kor );
		System.out.println( "���� :" +avg1.eng );
		System.out.println( "���� :" +total );
		System.out.println( "��� :" +average );

	}

}
