package oop04_Abstraction;

public class TvInfoClass extends ProductInfoClass {
	
	private String screenSize;
	private String screenType;
	
	public void setInfo(String company, String name, String sid, String screenSize,
			String screenType) {
	 super.setInfo(company, name, sid);
	 this.screenSize=screenSize;
	 this.screenType=screenType;
	 
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("스크린싸이즈:" + this.screenSize);
		System.out.println("스크린타입:" + this.screenType);
	}
	
	

	

}
