package week1.Day2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int maxrange = 8;
		int num1 = 0;
		int num2 = 1;

		System.out.println("Fibonacci Series up to " + maxrange + " terms: " + "\n");

		for (int i =1; i <= maxrange; ++i) {
			System.out.println(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

	}

}
