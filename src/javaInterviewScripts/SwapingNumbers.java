package javaInterviewScripts;

public class SwapingNumbers {

	public static void main(String[] args) {
		// Swaping means interchanges the values of the 2 variable values
		withoutTemp(10, 20);
		System.out.println();
		System.out.println();

		withoutTemp('1', 40, 50);
		System.out.println();
		System.out.println();

		withTemp(50, 70, 0);
		withTemp(50, 9000, 80);
		System.out.println();
		System.out.println();

		withXOR();

	}

	public static void withTemp(int x, int y, int temp) {
		System.out.println("using temp variable");
		System.out.println("before swapping");
		System.out.println(x);
		System.out.println(y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping");
		System.out.println(x);
		System.out.println(y);
	}

	public static void withoutTemp(int x, int y) {
		System.out.println("By using * and / operators");

		// 3.without using the third variable,by using *,/ operator
		System.out.println("before swapping");
		System.out.println(x);
		System.out.println(y);
		x = x * y;// 200
		y = x / y;// (200/20)=10
		x = x / y;// (200/10)=20
		System.out.println("After swapping");
		System.out.println(x);
		System.out.println(y);

	}

	public static void withoutTemp(char z, int x, int y) {
		// 3.without using the third variable,by using *,/ operator
		System.out.println("By using + and - operators");
		System.out.println("before swapping");
		System.out.println(x);
		System.out.println(y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping");
		System.out.println(x);
		System.out.println(y);

	}

	public static void withXOR() {
		int x = 10;
		int y = 20;
		System.out.println("By using + and - operators");
		System.out.println("before swapping");
		System.out.println(x);
		System.out.println(y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("After swapping");
		System.out.println(x);
		System.out.println(y);
	}

}
