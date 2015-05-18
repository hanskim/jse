package oop01_Syntex;

public class AverageB {
	
	String name ; 
	int kor ; 
	int eng ; 

	
	
	public void getavg(){
		
		
	}
		
		

	
	// 메소드 정의 
	
	// 메소드의 객체화
	// 미완성!!!!!
	
	
	public static void main(String[] args) {
		
		AverageB avg2 = new AverageB();
		
		int total ; 
		double average ; 
		

		avg2.name ="헐크 " ; 
		avg2.kor = 95; 
		avg2.eng = 45; 
		total = avg2.kor +avg2.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg2.name +"의 성적표 "+ "========");
		System.out.println( "국어 :" +avg2.kor );
		System.out.println( "영어 :" +avg2.eng );
		System.out.println( "총점 :" +total );
		System.out.println( "평균 :" +average );
	
		avg2.name ="아이언맨 " ; 
		avg2.kor = 75; 
		avg2.eng = 85; 
		total = avg2.kor +avg2.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg2.name +"의 성적표 "+ "========");
		System.out.println( "국어 :" +avg2.kor );
		System.out.println( "영어 :" +avg2.eng );
		System.out.println( "총점 :" +total );
		System.out.println( "평균 :" +average );
	
		avg2.name ="토르 " ; 
		avg2.kor = 85; 
		avg2.eng = 65; 
		total = avg2.kor +avg2.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg2.name +"의 성적표 "+ "========");
		System.out.println( "국어 :" +avg2.kor );
		System.out.println( "영어 :" +avg2.eng );
		System.out.println( "총점 :" +total );
		System.out.println( "평균 :" +average );
	
		
		System.out.println( " ===    " );
		
		
		
	}

}
