package oop04_Abstraction;

public class ProductClassController {

	public static void main(String[] args) {
		ComputerInfoClass c1 = new ComputerInfoClass( );
		c1.setInfo("»ï¼º", "¼¾½º", "a-1234-4567", "dual-core", "8G", "500G");
		c1.displayInfo();
		System.out.println("");
		
		TvInfoClass t1 = new TvInfoClass( );
		t1.setInfo("¿¤Áö", "¿¢½º³ëÆ®", "123$T", "18*25", "Æò¸é");
		t1.displayInfo();
		
	

	}

}
