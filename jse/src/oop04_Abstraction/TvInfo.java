package oop04_Abstraction;

public class TvInfo extends ProductInfo {
	
	protected String inchInfo;
	protected String screenRatioInfo;

	@Override
	public void displayProductInfo() {
		System.out.println("����ȸ�� : "+ this.productCompany);
		System.out.println("��ǰ�� : "+ this.productName);
		System.out.println("������ȣ : "+ this.productSerialID);
		System.out.println("��ġ���� : "+ this.inchInfo);
		System.out.println("ȭ����� : "+ this.screenRatioInfo);
	}
	
	public void setTvInfo(String productCompany, String productName,
			String productSerialID, String inchInfo, String screenRatioInfo
			) {
		super.setProductInfo(productCompany, productName, productSerialID);
        this.inchInfo=inchInfo;
        this.screenRatioInfo=screenRatioInfo;

	}

}