package Problem5;

public class Problem513 {

	public static void main(String[] args) {

		int data[][] = new int[4][4];

		for (int i = 0; i < data.length; i++) {
			for (int n = 0; n < data[i].length; n++) {
				data[i][n] = (int) (Math.random() * 9) + 1;
			}
		}
		for (int i = 0; i < data.length; i++) {
			for (int n = 0; n < data[i].length; n++) {
				System.out.print(data[i][n] + " ");
			}
			System.out.println();
		}
		int max = data[0][0];
		int min = data[0][0];

		for (int i = 0; i < data.length; i++) {
			for (int n = 0; n < data[i].length; n++) {
				if (data[i][n] > max) {
					max = data[i][n];
				}
			}
			
		}System.out.println("\n最大値" + max);
		
		for (int i = 0; i < data.length; i++) {
			for (int n = 0; n < data[i].length; n++) {
				if (data[i][n] < min) {
					min = data[i][n];
				}
			}
			
		}System.out.println("最小値" + min);

	}

}
