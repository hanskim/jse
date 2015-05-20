package oop03_Inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		
		// 일반적이 객체생성
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		//Cclass c = new Bclass;
		// 부모타입 = new 자식타입
		Aclass a2 = new Bclass();     // Bclass라는 생성자(=메소드)의 결과값이 Aclass가로 묵시적형변환 : upcasting
		// 오버라이딩 시 자식클랫그 메소드 우선 출력
		a2.over(1);
		// 오버라이딩 하지 않으면 부모클래스 우선 호출
		a2.noOver(1);
		//a2.noOver("bbb"); 오류
		
		Bclass b2=(Bclass) a2 ;   // (Aclass 타입의)a2겍체값이  Bclass로 강제적 형변환 :  downcasting
		b2.over(1);
		b2.noOver("KKK");
	}

}

class Aclass{
	int a;
	
	void over(int i) {
		
      System.out.println("Aclass-over()" + (i*10));
	}
	void noOver(int i){
	      System.out.println("Aclass-over()" + i);
	}
}
class Bclass extends Aclass{
	
	void over(int i){
	      System.out.println("Bclass-over()" + (i*10000));
	}
	void noOver(String s){
	      System.out.println("Bclass-over()" + s);
	}
}