package Problem5;

public class Problem502 {
	
	public static void main(String[] args) {
		
		int[] data = new int[10];
		
		
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*100)+1;
			System.out.print(data[i] + " ");
		}
		
		System.out.print("\n\n奇数: ");
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 2 == 1) {
				System.out.print(data[i]+ " ");
			}
		}
		
		System.out.print("\n\n偶数: ");
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 2 == 0) {
				System.out.print(data[i]+ " ");
			}
		}
	}

}
