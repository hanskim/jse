package comm04.arr;

public class No03_ForloopArrayVO {

	void Arry() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;

		// 1���� 5������ �ձ��ϱ�

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println("arr[" + i + "]��� : " + arr[i]);
		}

		System.out.println("1����" + arr.length + "������ ��: " + sum);
	}

}
