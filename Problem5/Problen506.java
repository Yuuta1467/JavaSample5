package Problem5;

public class Problen506 {
	
	public static void main(String[] args) {
		
		int[] data = new int[10];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
		}
		
		int max = data[0];
		int min = data[0];
		int sum = 0;
		
		System.out.print("\n\n最大値:");
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		System.out.print(max);
		
		System.out.print("\n\n最小値:");
		for(int i = 0; i < data.length; i++) {
			if (data[i] < min) {
                min = data[i];
            }
		}
		System.out.print(min);
		
		System.out.print("\n\n平均値:");
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		double avg = (double)sum / data.length;
		System.out.print(avg);
	}

}
