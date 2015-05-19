package oop02_Syntex;
/*
 * 메소드에 값을 전달하는 방법
 * Call by value ; 
 * 메소드로 한 문자, 상수 문자열, 숫자를 전달하면 전부 값에 의한 전달
 * C언어에서 숫자, 문자 계열만 , 문자열은 char * 형태이므로 call by address임.
 * C언어 처럼 주소(포인터) 를 전달하는 Call by address는 자바에서 없다.
 * (call by reference와는 개념이 다름 .. /  C언어는 메모리에 직접접근 vs 자바는 클래스(in static)를 통해서 
 *  
 * Call by value의 경우 값을 전달하면 값을 전송한 원본 변수는 젼형이 안된다.
 * 단지 stack 간의 값이 복사된다.
 * 
 * Call by reference의 경우 참조값 (=hashCode)를 전달한 객체는 자신의 참조값이 전달됨으로써 값이 변화가 발생할수 있다.
 * Call by Reference
 * 
 * 원본 객체의 데이터가 변경된다. 변경을 목적으로 하는 경우 이용됨.
 * String 객체의 데이터 전달 유형
 * String  객체는 객체형으로 내부적으로 call by reference로 사용되거나 문자열 할당 등의 조작 시 
 * 무조건 call by value 기능으로 작동한다.
 * 문자열이 같으면 멤변이나 지변은 같은 hash Code 를 가지고 있다가 영영 구분이 없어진다. (
 * 그러나 새로운 문자열이 지변에 대입하면 또 다른 hash code가 생성되면서 멤버변수와 구분되게 된다.
 */

public class No08_CallByReference {

}
