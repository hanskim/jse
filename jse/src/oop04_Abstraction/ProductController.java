package oop04_Abstraction;

public class ProductController {

	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo( );
		ci.setComputerInfo("�Ｚ", "����", "a-1234-4567", "dual-core", "8G", "500M");
		ci.displayProductInfo();
		System.out.println();
		
		
		TvInfo ti  = new TvInfo() ; 
		//set �޼ҵ�ȣ��
		//tv���� : ȸ�� : LG , ��ǰ�� : X�˹��� , ��ǪID : X-1234 , ȭ������� : 42��ġ ,  ȭ����� : 16:9
		ti.setTvInfo("LG", "X�˹���", " X-1234", "42��ġ", "16:9");
	    ti.displayProductInfo();
		System.out.println();

	}

}
