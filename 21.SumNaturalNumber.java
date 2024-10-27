import java.util.*;
class SumNaturalNumber
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=num;i++)
		{
			sum = sum + i;
		}
		System.out.print("The Sum of number is " + " = " + sum );
	}
}