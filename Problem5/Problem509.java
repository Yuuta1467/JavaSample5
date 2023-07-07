package Problem5;

public class Problem509 {

	public static void main(String[] args) {

		int[] data = new int[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 100) + 1;
			System.out.print(data[i] + " ");
		}
		
		
		System.out.print("\n\n50以上:");
		for (int i = 0; i < data.length; i++) {
			if(data[i] >= 50) {
				System.out.print(data[i] + " ");
			}
		}
		
		System.out.print("\n50未満:");
		for (int i = 0; i < data.length; i++) {
			if(data[i] < 50) {
				System.out.print(data[i] + " ");
			}
		}
	}
}
