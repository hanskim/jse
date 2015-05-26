package oop09_NestedClass;

public class InnerClassAnonyServiceImpl  {
	
	String data = "Hello Anonymous!!";
	
	public void print() {
		new InnerClassAnonyService() {   // 생성자가 밑에 메소드 실행하자마자 사라져버림
			@Override
			public void printData() {
				System.out.println( "익명 내부클래스 출력 :" +data);
			}
		}.printData();      // excute라는 의미 
		
	}

}
