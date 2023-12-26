package javaInterviewScripts;

public class StarsPrinting {

	public static void main(String[] args) {

		printStar1(10);
		printStar(6);
		revTriOfStars();
	}
	// by using for loops and if else condition

	public static void printStar1(int size) {
		for (int i = 0; i < size; i++) {
			// i represents the no of rows to be print
			String rstr = "";
			for (int j = 0; j < size; j++) {// j forloop is for decreases the spaces on depending on the rows fro loop
				if (j < size - i) {
					rstr = rstr + " ";
				} else {
					rstr = rstr + "*";
				}

			}

			System.out.println(rstr);
		}
	}

	// by using 3 for loops
	public static void printStar(int size) {
		for (int i = 0; i < size; i++) {
			// i represents the no of rows to be print
			String rstr = "";
			for (int j = 0; j < size - i; j++) {// j forloop is for decreases the spaces on depending on the rows fro
												// loop
				rstr = rstr + " ";
			}

			for (int j = 0; j < i; j++) {// here j forloop is for increasing the stars on depending the no of rows for
											// loop
				rstr = rstr + "*";

			}
			System.out.println(rstr);
		}
	}

	public static void revTriOfStars() {
		String star = "*";
		for (int i = 0; i < 5; i++) {

			System.out.println(star);

			star = star + "* ";
		}
	}

}
