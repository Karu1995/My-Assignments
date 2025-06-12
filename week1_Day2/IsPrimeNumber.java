package week1_Day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		int count=0;
		for (int i = 2; i<=num-1; i++) 
		{
			if (num%i ==0) 
			{
				count++;	
			} 
			
			if (count == 0) 
			{
				System.out.println(num + " is a prime number");
			}
			else 
			{
				System.out.println(num + "is not a prime number");
			}
			
		}
		
	}

}

