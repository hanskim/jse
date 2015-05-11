package comm02.op;

public class No4_ConditionDemo {

	public static void main(String[] args) {
		
		int val01 =1 ; 
		int val02 =2 ; 
		
		if((val01==1)&&(val02 ==2)){
			System.out.println(" 두개 다 true인 경우");
		} 
		if((val01!=1)||(val02==2)){
			System.out.println("하나만 false여도 false  인 경우");		
		}
		
	}
}
