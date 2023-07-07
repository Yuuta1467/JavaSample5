package Problem5;

public class Problem505 {

	public static void main(String[] args) {

		int[] data = new int[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 10) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.print("\n\n3の倍数:");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				System.out.print(data[i] + " ");
			}
		}
		
		System.out.print("\n\n3の倍数意外:");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 != 0) {
				System.out.print(data[i] + " ");
			}
		}
	}

}
