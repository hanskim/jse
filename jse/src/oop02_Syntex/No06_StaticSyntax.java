package oop02_Syntex;
/*
 * static변수
 * 정적변수
 * 클래스가 jvm 상으로 로딩 시 메모리를 할당한다
 * 해시코드(HashCode)의 출력
 * 객체의 해시코드(일종의 메소드) 는 JVM의 해시 알고리즘에 의해 패키지명과 클래스명이 조합되어 해시코드 산출
 * 
 * String  : 객체변수의 값이 같을 경우  (= 같은 문자열을 갖고 있을 경우) 해시코드를 공유한다.
 * String str1 ="헐크" ; 
 * String str2 ="헐크" ; 
 * str1.hashCode() = str2.hashCode() ;
 * 
 * Static 사용방법
 * 멤변 중 모든 인스터스에 공통적으로 사용해야하는 것에 붙여서 사용
 * 인스턴스 변수를 사용하지 않고 클래스에서 바로 접근하려할시 
 */

public class No06_StaticSyntax {
	public static void main(String[] args) {
		String hulk1 ="헐크";
		String hulk2 =new String("헐크");
		// 위 두개의 주소값은 같다 ? 원칙은 같은 수 없다 근데  why ? 
		//String 이 배열 타입입고 자주 쓰는 타입은 재사용하라고 같은 주소값을 갖음
		// 이것 자체가 불멸의 객체 ? ?  특수한 형태라고.....이해할 것.
		// 위 방식처럼 static이 이역할을 한다( 계속쓸거니까.. 고정해놔라)
		
	}
}
