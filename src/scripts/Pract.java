package scripts;

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid(6);
		rPyramid(6);
	}

	public static void pyramid(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = n - i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void rPyramid(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <n ; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
