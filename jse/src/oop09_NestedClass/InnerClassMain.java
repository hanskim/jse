package oop09_NestedClass;

/*
 내부클래스의 첫번째 형태
 -  인스턴스 내부 클래스
 -  멤버메소드를 클래스 내부에 선언함. , 잘 안씀.

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
		//().new Inner() 가 없이 바로 inner에 접근 가능 =>클래스로 접근하는 방식  // 
		// 별로 좋은 방식은 아님.
		inner.printData();
	}
	

	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}

	// alt +shif +m : 메소드독립 단축키
	// 리팩토링  ,main의 static 메모리 점유된 멤번변수를 메소드化 하는 작업 

	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
		// InnerClassInstance().new Inner(); => 생성자로 접근하는 방식
		inn.printData();
	}

}
