package Problem5;

public class Problem510 {
	
	public static void main(String[] args) {
		
		int[] data = new int[7];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < data.length; i++) {
			for(int n = 0; n < data[i]; n++) {
				System.out.print("*");
			}System.out.println();
			
		}
	}

}
