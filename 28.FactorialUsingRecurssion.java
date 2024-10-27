import java.util.*;
class FactorialUsingRecurssion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int  fact = getFacrecurrsion(num);
		System.out.print(" Factorial number using Recursion " + num + " = " +fact );
	}
	
	public static int getFacrecurrsion(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return num * getFacrecurrsion(num - 1);
		}
		// System.out.print(" Factorial number using Recursion " + num * getFacrecurrsion(num - 1) );
	}
}


/*
Enter the number = 3
 Factorial number using Recursion 3 = 6
 
 Enter the number = 10
 Factorial number using Recursion 10 = 3628800
 */