package oop01_EnCapsule;

public class PayService {

	// 계산, 연산 등 수행
	PayVO vo = new PayVO();
	
	public String servicename(String String) {
	
		return vo.getName()  ;
	}
	
	public int servicesalary(int salary ) {
		
		return vo.getSalary();
	}

	public String showTax() {
		// TODO Auto-generated method stub
		return vo.TAX;
	}
	

}
	
