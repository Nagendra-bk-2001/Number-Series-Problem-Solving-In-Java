import java.util.*;
class PrimeNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		boolean isprime = false;
		for(int i = 1;i<=num;i++)
		{
			if(num % i != 0)
			{
				isprime = false ;
			}
			else
			{
				isprime = true;
			}
		}
		if (isprime)
		{
			System.out.print("This is a Prime Number " + num);
		}
		else
		{
			System.out.print("This is not a Prime Number " + num);
		}
	}
}