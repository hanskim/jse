package oop09_NestedClass;

/*
 ����Ŭ������ ù��° ����
 -  �ν��Ͻ� ���� Ŭ����
 -  ����޼ҵ带 Ŭ���� ���ο� ������. , �� �Ⱦ�.

 * 
 */

public class InnerClassMain {
	public static void main(String[] args) {

		InnerClassMain m = new InnerClassMain();
		 //m.getInnerClassInstance();
		//m.getInnerClassLocal();
		//m.getInnerClassStatic();
		
		m.getInnerClassAnonyServiceImpl();
		
		
	}


	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl  inn = new InnerClassAnonyServiceImpl() ;
		inn.print();
	}


	public void getInnerClassStatic() {
		InnerClassStatic.Inner inner = new InnerClassStatic.Inner(); 
		//().new Inner() �� ���� �ٷ� inner�� ���� ���� =>Ŭ������ �����ϴ� ���  // 
		// ���� ���� ����� �ƴ�.
		inner.printData();
	}
	

	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}

	// alt +shif +m : �޼ҵ嵶�� ����Ű
	// �����丵  ,main�� static �޸� ������ ��������� �޼ҵ��� �ϴ� �۾� 

	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
		// InnerClassInstance().new Inner(); => �����ڷ� �����ϴ� ���
		inn.printData();
	}

}
