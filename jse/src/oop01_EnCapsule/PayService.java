package oop01_EnCapsule;

// 계산, 연산 등 수행
public class PayService {
	
	//PayVO vo = new PayVO();  해당 문제에서 VO는 실질적으로 필요없음
	
	
	
	public String Name(String String) {
	
		return String  ;
	}
	
	public int Salary(int salary ) {
		
		return salary;
	}

	public int ShowTax(int nextInt) {
		return (int) (nextInt*0.1);
	}

	public int ShowIncome(int nextInt) {
		return nextInt-ShowTax(nextInt) ;
	}

}
	
