package javaInterviewScripts;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(19));
	}

	public static boolean isPrime(int n) {
		// 1 is not prime number that we know,prime number means the number which is
		// divisible by only itself
		for (int i = 2; i <=n/2; i++) {
			System.out.println(i);
			if (n % i == 0) {
				return false;
			}
			
		}

		return true;
	}


}
