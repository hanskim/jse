package oop03_Inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		
		// �Ϲ����� ��ü����
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		//Cclass c = new Bclass;
		// �θ�Ÿ�� = new �ڽ�Ÿ��
		Aclass a2 = new Bclass();     // Bclass��� ������(=�޼ҵ�)�� ������� Aclass���� ����������ȯ : upcasting
		// �������̵� �� �ڽ�Ŭ���� �޼ҵ� �켱 ���
		a2.over(1);
		// �������̵� ���� ������ �θ�Ŭ���� �켱 ȣ��
		a2.noOver(1);
		//a2.noOver("bbb"); ����
		
		Bclass b2=(Bclass) a2 ;   // (Aclass Ÿ����)a2��ü����  Bclass�� ������ ����ȯ :  downcasting
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