package scripts;

public class Square {
	public static void s(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = n-i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// square(6);
		//pyramid(6);
		pyramid1(6);
		revPyramid(6);
		//s(8);
	}

	public static void square(int n) {
		for (int i = 1; i < n; i++) {

			for (int j = 1; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

	public static void pyramid(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (n - i > j) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void pyramid1(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = n-i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void revPyramid(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j <n; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
