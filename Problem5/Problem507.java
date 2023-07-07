package Problem5;

public class Problem507 {

	public static void main(String[] args) {

		int[] data = new int[5];

		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 10) + 1;
			System.out.print(data[i] + " ");
		}

		int sum = 0;

		System.out.print("\n\n合計値:");
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		System.out.println(sum);

		double avg = sum / data.length;
		System.out.println("平均値:" + avg);

		System.out.print("\n\n平均値より大きい:");
		for (int i = 0; i < data.length; i++) {
			if (data[i] > avg) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.print("\n平均値より小さい数: ");
		for (int i = 0; i < data.length; i++) {
			if (data[i] < avg) {
				System.out.print(data[i] + " ");
			}
		}
	}

}
