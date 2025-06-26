package week1.Day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		int a = 121;
		int reversed = 0;
		int original = a;

		for (int temp = a; temp > 0; temp /= 10) {
			int j = temp % 10;
			reversed = reversed * 10 + j;
		}

		if (original == reversed) {
			System.out.println(original + " It is palindrome");
		} else {
			System.out.println(original + " It is not palindrome");
		}
	}
}