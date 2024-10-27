import java.util.*;
class PositiveNegative
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.print("This is Positive ");
		}
		else if (num<0)
		{
			System.out.print("This is Negative ");
		}
		else
		{
			System.out.print("This is ZERO");
		}
	}
}




/*
sample run
Enter the Number = 1
This is Positive

Enter the Number = -1
This is Negative

Enter the Number = 0
This is ZERO
*/