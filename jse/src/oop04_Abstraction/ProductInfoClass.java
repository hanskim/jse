package oop04_Abstraction;

public class ProductInfoClass implements ProductInterface {
	
	private String company ; 
	private String name ; 
	private String sid ; 
	
	public void setInfo(String company,String name,String sid) {
		this.company =company;
		this.name =name;
		this.sid =sid;

	}
	

	@Override
	public void displayInfo() {
		System.out.println("ȸ�� : " + this.company);
		System.out.println("�̸� : " + this.name);
		System.out.println("sid : " + this.sid);
		
	}
	
	

}
