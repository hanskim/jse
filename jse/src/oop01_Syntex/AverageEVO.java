package oop01_Syntex;

public class AverageEVO {
	
	
	private String name ; 
	private int kor ; 
	private int eng ;
	
	public AverageEVO(String string, int i, int j) {
		this.name=string;
		this.kor=i ; 
		this.eng=j;
	}
	
	public String Name(){
		return this.name ; 
	}
	
	public int Kor(){
		return this.kor ; 
	}
	
	public int Eng(){
		return this.eng ; 
	}
	
	
	
	


}
