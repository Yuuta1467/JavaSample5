package sample5;

public class Sample502 {
	
	public static void main(String[] args) {
		
		double[] d = new double[4];
		double sum,avg;
		
		d[0] = 1.2;
		d[1] = 3.7;
		d[2] = 4.1;
		d[3] = 1.4;
		sum = 0.0;
		for(int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
			sum += d[i];
		}
		System.out.println();
		avg = sum / 4.0;
		System.out.println("合計値:" + sum);
		System.out.println("平均値:" + avg);
	}

}
