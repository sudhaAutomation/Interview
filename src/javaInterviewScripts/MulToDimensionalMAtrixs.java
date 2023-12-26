package javaInterviewScripts;

public class MulToDimensionalMAtrixs {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int c[][] = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			// i represents the row
			for (int j = 0; j < b.length; j++) {
				// j represents the column
				int sum = 0;
				for (int k = 0; k < c.length; k++) {
					// k will represents the particular element of row and column
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
				System.out.print(c[i][j] + "   ");
			}
			System.out.println();
		}

	}

}
