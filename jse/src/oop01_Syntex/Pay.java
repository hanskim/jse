package oop01_Syntex;

public class Pay {
	
	String name ;
	int salary ; 
	static final double TAX =0.1;
	
  /*
	private static void pay(String string, int i) {
		System.out.println("==="+string+"의 5월달 실급여(만원) : "+ i*(1-TAX) +"만원 입니다.");
	}
*/
	
	public static void main(String[] args) {
		
		double income;
		
		Pay pay = new Pay();  // 참조변수를 선언함.!!
		
		pay.name = "헬보이";
		pay.salary =300 ;
		income =pay.salary*(1-TAX);    // TAX 가 같은 STATIC에 있음으로  Pay.TAX로 굳이 할 필요 없다.
		System.out.println(pay.name+"의 5월달 실급여 : "+ income +"입니다.");
		
		pay.name = "헐크";
		pay.salary =270 ;
		income =pay.salary*(1-TAX);
		System.out.println(pay.name+"의 5월달 실급여 : "+ income +"입니다.");
		
		pay.name = "아이언맨";
		pay.salary =450 ;
		income =pay.salary*(1-TAX);
		System.out.println(pay.name+"의 5월달 실급여 : "+ income +"입니다.");
	
		System.out.println("");
		
		
		/*
		Pay pay = new Pay( );
		pay("헬보이", 300) ;
		pay("아이언멘", 500) ;
		pay("토르", 200) ;
		*/
		
	}
}
