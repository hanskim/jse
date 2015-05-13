package comm04.arr;

public class No03_ForloopArrayVO {

	void Arry() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;

		// 1부터 5까지의 합구하기

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println("arr[" + i + "]출력 : " + arr[i]);
		}

		System.out.println("1부터" + arr.length + "까지의 합: " + sum);
	}

}
