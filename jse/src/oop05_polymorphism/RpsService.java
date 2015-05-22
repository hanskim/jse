package oop05_polymorphism;

public interface RpsService {
	public int ShowComValue();
	public String ShowRpsValue(int playerValue) ;
	public String ShowWiner(int playerValue, int comValue);
	public void ErrorMsg1(int playerValue);
	public void ErrorMsg2(int playerValue);

}
