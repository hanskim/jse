package cmm03.flow;

public class No06_Star2 {

	public static void main(String[] args) {

		for (int i =1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("¡Ø");
			}
			System.out.println("");
		
		}
	}
}
