package comm04.arr;

public class No04_MultiDimDemo {
	public static void main(String[] args) {
		String[][] names = { { "Mr.", "Mrs.", "Ms." }, { "Smith", "John"} };

		System.out.println(names[0][0] + names[1][0]); // Mr.Smith ����ϱ�
		System.out.println(names[0][2] + names[1][1]); // Ms.John ����ϱ�
		

	}
}
