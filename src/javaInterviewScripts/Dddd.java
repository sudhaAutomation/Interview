package javaInterviewScripts;

public class Dddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid(6);
		System.out.println();
		rpyramid(6);
	}

	public static void pyramid(int n) {
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n-k; i++) {
				System.out.print(" ");
			}
				for (int j = n - k; j < n; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
	
	public static void rpyramid(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" * ");
			}
			for (int j = n-i; j < n; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
