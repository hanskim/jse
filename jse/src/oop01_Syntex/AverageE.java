package oop01_Syntex;

 //getter setter사용 불가
// 생성자료
// 단 average() , total() 는 메소드; 

public class AverageE {
	public static void main(String[] args) {
		
		AverageEVO evo = new AverageEVO("홍길동",90,85);
		
		System.out.println("");
		
		System.out.println( "========"+evo.Name()+"의 성적표 "+ "========");
		System.out.println( "국어 :" +evo.Kor() );
		System.out.println( "영어 :" +evo.Eng() );
	
	
		
		


	}

}
