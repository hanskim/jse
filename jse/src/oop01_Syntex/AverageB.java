package oop01_Syntex;

public class AverageB {
	
	String name ; 
	int kor ; 
	int eng ; 

	
	
	public void getavg(){
		
		
	}
		
		

	
	// �޼ҵ� ���� 
	
	// �޼ҵ��� ��üȭ
	// �̿ϼ�!!!!!
	
	
	public static void main(String[] args) {
		
		AverageB avg2 = new AverageB();
		
		int total ; 
		double average ; 
		

		avg2.name ="��ũ " ; 
		avg2.kor = 95; 
		avg2.eng = 45; 
		total = avg2.kor +avg2.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg2.name +"�� ����ǥ "+ "========");
		System.out.println( "���� :" +avg2.kor );
		System.out.println( "���� :" +avg2.eng );
		System.out.println( "���� :" +total );
		System.out.println( "��� :" +average );
	
		avg2.name ="���̾�� " ; 
		avg2.kor = 75; 
		avg2.eng = 85; 
		total = avg2.kor +avg2.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg2.name +"�� ����ǥ "+ "========");
		System.out.println( "���� :" +avg2.kor );
		System.out.println( "���� :" +avg2.eng );
		System.out.println( "���� :" +total );
		System.out.println( "��� :" +average );
	
		avg2.name ="�丣 " ; 
		avg2.kor = 85; 
		avg2.eng = 65; 
		total = avg2.kor +avg2.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg2.name +"�� ����ǥ "+ "========");
		System.out.println( "���� :" +avg2.kor );
		System.out.println( "���� :" +avg2.eng );
		System.out.println( "���� :" +total );
		System.out.println( "��� :" +average );
	
		
		System.out.println( " ===    " );
		
		
		
	}

}
