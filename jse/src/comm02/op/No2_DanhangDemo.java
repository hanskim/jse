package comm02.op;

public class No2_DanhangDemo {

	public static void main(String[] args) {
		int i =5 ;
		int j =0 ; 
		j=i++ ;       // 후위증감은 변수값을 읽어온 후 연산
		System.out.println("j=i++의 결과값");
		System.out.println("============");
		System.out.println("i의 값 : "+ i);
        System.out.println("j의 값 : "+ j);
        System.out.println("");
        
        int x =5; 
        int y =0 ;
        y =++x ;     // 1을 먼저 증감하고 연산
        System.out.println("y=x++의 결과값");
		System.out.println("============");
		System.out.println("x의 값 : "+ x);
        System.out.println("y의 값 : "+ y);
        System.out.println("");
        
	}
}
