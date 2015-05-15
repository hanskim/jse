package oop01_EnCapsule;

public class PayVO {
	// get, set 만 입력
	private String name ;   
	private int salary ;     
	private double tax ;        // static final double TAX =0.1 ;  상수는 보통 대문자로 표시
	private double income ;    //
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary ) {
		this.salary = salary ;
	}




}
