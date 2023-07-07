package Problem5;

public class Problem512 {

	public static void main(String[] args) {

		int[][] data = new int[4][4];

		for (int i = 0; i < data.length; i++) {
			for (int n = 0; n < data[i].length; n++) {
				data[i][n] = (int) (Math.random() * 9) + 1;
			}
		}
		for (int i = 0; i < data.length; i++) {
			for (int n = 0; n < data[i].length; n++) {
				System.out.print(data[i][n] + " ");
			}System.out.println();
		}

	}

}
