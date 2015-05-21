package oop04_Abstraction;

public class TvInfo extends ProductInfo {
	
	protected String inchInfo;
	protected String screenRatioInfo;

	@Override
	public void displayProductInfo() {
		System.out.println("제조회사 : "+ this.productCompany);
		System.out.println("제품명 : "+ this.productName);
		System.out.println("고유번호 : "+ this.productSerialID);
		System.out.println("인치정보 : "+ this.inchInfo);
		System.out.println("화면비율 : "+ this.screenRatioInfo);
	}
	
	public void setTvInfo(String productCompany, String productName,
			String productSerialID, String inchInfo, String screenRatioInfo
			) {
		super.setProductInfo(productCompany, productName, productSerialID);
        this.inchInfo=inchInfo;
        this.screenRatioInfo=screenRatioInfo;

	}

}
