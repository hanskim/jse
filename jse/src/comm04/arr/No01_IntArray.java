package comm04.arr;

public class No01_IntArray {

	public static void main(String[] args) {
		int[] intArr;
		intArr =new int[10];
		
		intArr[0]=100 ;
		intArr[1]=200 ;
		intArr[2]=300 ;
		intArr[3]=400 ;
		intArr[4]=500 ;
		intArr[5]=600 ;
		intArr[6]=700 ;
		intArr[7]=800 ;
		intArr[8]=900 ;
		intArr[9]=1000 ;
		
		System.out.println("Element at index 9:"+intArr[9]);
		
		for(int i=0; i<intArr.length ; i++){
		System.out.println("intArr[i]의 값:"+intArr[i]);
		}
		
		for(int j: intArr){
			System.out.println("intArr["+j+"]의 값:"+j);
		}

	}

}
