import java.util.*;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		 int count = 0;
		
		for (int i =1;i<=num;i++)
		{
			if(num % i == 0)
				count ++;
		}
		if(count == 2)
		{
			System.out.print("This is a Prime number " + num);
		}
		else
		{
			System.out.print("This is not a Prime number " + num);
		}
	}
}
		// if(isprimeNumber(num))
		// {
			// System.out.print("This is a Prime number " + num);
		// }
		// else
		// {
			// System.out.print("This is not a Prime number " + num);
		// }
		
	// }
	
	// public static boolean isprimeNumber(int num)
	
	// {
		// boolean isprime = false;
		// for(int i = 1; i<= num;i++)
		// {
			// if(num % i != 0)
			// {
				// isprime = false;
			// }
			// else
			// {
				// isprime = true;
				// break;
			// }
		// }
		// return isprime;
		


/*

Enter the number = 11
This is a Prime number 11

Enter the number = 9
This is not a Prime number 9

*/