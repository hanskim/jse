package oop01_EnCapsule;

// ���, ���� �� ����
public class PayService {
	
	//PayVO vo = new PayVO();  �ش� �������� VO�� ���������� �ʿ����
	
	
	
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
	
