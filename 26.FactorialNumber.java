import java.util.*;
class FactorialNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		factorIs(num);
	}
	public static void factorIs(int num)
	{
		int fact =1;
		for(int i = 1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.print(fact + "");
	}
}



/*

Enter the number =6
Factorial is 6 is 720
*/