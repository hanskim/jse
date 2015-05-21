package oop04_Abstraction;

public class ProductController {

	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo( );
		ci.setComputerInfo("삼성", "센스", "a-1234-4567", "dual-core", "8G", "500M");
		ci.displayProductInfo();
		System.out.println();
		
		
		TvInfo ti  = new TvInfo() ; 
		//set 메소드호출
		//tv정보 : 회사 : LG , 제품명 : X켄버스 , 제푸ID : X-1234 , 화면사이즈 : 42인치 ,  화면비율 : 16:9
		ti.setTvInfo("LG", "X켄버스", " X-1234", "42인치", "16:9");
	    ti.displayProductInfo();
		System.out.println();

	}

}
