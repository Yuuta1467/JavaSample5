package problem6;

public class Minmax {
	//  最大値の取得
	public int max(int n1, int n2, int n3) {
		int max = n1;
		if (max < n2) {
			max = n2;
		}
		if (max < n3) {
			max = n3;
		}
		return max;
	}

	//  最大値の取得
	public int min(int n1, int n2, int n3) {
		int min = n1;
		if (n2 < min) {
			min = n2;
		}
		if (n3 < min) {
			min = n3;
		}
		return min;
	}

}
