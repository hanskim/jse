package comm04.arr;

public class No03_ForloopArrayVO {
	
	private int a, b, c, d, e;  // 멤변
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		
		this.e = e;
	}

	void Arry(int a, int b, int c, int d, int e) {
		setA(a);
		setB(b);
		setC(c);
		setD(d);
		setE(e);
		
		//int[] arr = new int[5];
		int[] arr ={getA(),getB(),getC(),getD(),getE()};
		int sum = 0;

		// 입력받은 5개의 숫자의 합
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			// System.out.println("arr[" + i + "]출력 : " + arr[i]);
		}
		System.out.println("요소들의 합:" + sum);
	}

}
