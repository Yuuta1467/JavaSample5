package Problem5;

public class Problem501 {

	public static void main(String[] args) {

		int n[] = { 0, 1, 2, 3, 4, 5, 6 };

		int i;
		for (i = 0; i < n.length; i++) {
			int dice = (int)(Math.random()*10)+1;
			System.out.print("a["+ dice +"]=" + n[i] + " ");
		}
		System.out.println("!!");
	}

}
