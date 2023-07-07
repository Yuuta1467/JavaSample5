package Problem5;

public class Problem508 {
	
	public static void main(String[] args) {
		
		int[] data = new int[5];

		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 21) - 10;
			System.out.print(data[i] + " ");
		}
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for (int i = 0; i < data.length; i++) {
			if(data[i] > 0) {
				sum += 1;
			}else if(data[i] < 0){
				sum2 += 1;
			}else {
				sum3 += 1;
			}
		}System.out.println("\n0より大きい数の合計:" + sum);
		System.out.println("0より小さい数の合計:" + sum2);
		System.out.print("0の合計:" + sum3);
	}

}
