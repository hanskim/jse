package comm02.op;

public class No2_DanhangDemo {

	public static void main(String[] args) {
		int i =5 ;
		int j =0 ; 
		j=i++ ;       // ���������� �������� �о�� �� ����
		System.out.println("j=i++�� �����");
		System.out.println("============");
		System.out.println("i�� �� : "+ i);
        System.out.println("j�� �� : "+ j);
        System.out.println("");
        
        int x =5; 
        int y =0 ;
        y =++x ;     // 1�� ���� �����ϰ� ����
        System.out.println("y=x++�� �����");
		System.out.println("============");
		System.out.println("x�� �� : "+ x);
        System.out.println("y�� �� : "+ y);
        System.out.println("");
        
	}
}
