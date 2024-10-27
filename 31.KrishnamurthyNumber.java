import java.util.*;
class KrishnamurthyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = "); 
		int num = sc.nextInt();
		int dig = 0;
		int temp =0;
		temp = num;
		int sum = 0;
		while(num>0)
		{
			dig = num % 10;
			sum = sum +  factorial(dig);
			num =  num/10;
		}
		if(temp == sum)
		{
			System.out.print("This is a KrishnamurthyNumber");
		}
		else
		{
			System.out.print("This is not a KrishnamurthyNumber");
		}
		
	}
	public static int factorial(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		else
		{
			return num * factorial(num - 1);
		}
	}
} 


/*
Enter the Number = 145
This is a KrishnamurthyNumber

Enter the Number = 123
This is not a KrishnamurthyNumber

*/