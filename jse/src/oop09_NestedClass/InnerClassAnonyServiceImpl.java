package oop09_NestedClass;

public class InnerClassAnonyServiceImpl  {
	
	String data = "Hello Anonymous!!";
	
	public void print() {
		new InnerClassAnonyService() {   // �����ڰ� �ؿ� �޼ҵ� �������ڸ��� ���������
			@Override
			public void printData() {
				System.out.println( "�͸� ����Ŭ���� ��� :" +data);
			}
		}.printData();      // excute��� �ǹ� 
		
	}

}
