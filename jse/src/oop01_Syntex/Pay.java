package oop01_Syntex;

public class Pay {
	
	String name ;
	int salary ; 
	static final double TAX =0.1;
	
  /*
	private static void pay(String string, int i) {
		System.out.println("==="+string+"�� 5���� �Ǳ޿�(����) : "+ i*(1-TAX) +"���� �Դϴ�.");
	}
*/
	
	public static void main(String[] args) {
		
		double income;
		
		Pay pay = new Pay();  // ���������� ������.!!
		
		pay.name = "�ﺸ��";
		pay.salary =300 ;
		income =pay.salary*(1-TAX);    // TAX �� ���� STATIC�� ��������  Pay.TAX�� ���� �� �ʿ� ����.
		System.out.println(pay.name+"�� 5���� �Ǳ޿� : "+ income +"�Դϴ�.");
		
		pay.name = "��ũ";
		pay.salary =270 ;
		income =pay.salary*(1-TAX);
		System.out.println(pay.name+"�� 5���� �Ǳ޿� : "+ income +"�Դϴ�.");
		
		pay.name = "���̾��";
		pay.salary =450 ;
		income =pay.salary*(1-TAX);
		System.out.println(pay.name+"�� 5���� �Ǳ޿� : "+ income +"�Դϴ�.");
	
		System.out.println("");
		
		
		/*
		Pay pay = new Pay( );
		pay("�ﺸ��", 300) ;
		pay("���̾��", 500) ;
		pay("�丣", 200) ;
		*/
		
	}
}
