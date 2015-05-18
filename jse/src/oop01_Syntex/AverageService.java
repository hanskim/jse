package oop01_Syntex;

//vo俊 乐带 avg() 皋家靛客  total() 皋家靛 贸府

public class AverageService {
	
	AverageDVO dvo = new AverageDVO();

	public void Input(String string, int i, int j) {
		dvo.setName(string);
		dvo.setKor(i);
		dvo.setEng(j);
	}
	
	public String getName(){
		return dvo.getName();
	}
	public int getKor(){
		return dvo.getKor();
	}
	public int getEng(){
		return dvo.getEng();
	}
	public int getTotal(){
		int total =dvo.getKor()+dvo.getEng();;
		return total;
	}
	public double getAverage(){
		return (dvo.getKor()+dvo.getEng()/2d);
	}
	
	
	

	
	
	

}
