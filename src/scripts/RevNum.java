package scripts;

public class RevNum {

	public static void main(String[] args) {
		System.out.println(revn(87654321));
	}
	public static int revn(int n) {
		int op = 0;
		while (n != 0) {
			 op = op*10+n % 10;
			n = n / 10;
		}
		return op;
	}
}
