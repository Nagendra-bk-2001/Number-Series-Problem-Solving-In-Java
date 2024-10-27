import java.util.*;
class HarshadNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number is  = ");
		int num = sc.nextInt();
		if(num % getSumDigite(num) ==0)
		{
			System.out.print("Harsha number is " + num);
		}
		else
		{
			System.out.print("Harsha number is not a " + num);
		}
	}
	public static int getSumDigite(int num)
	{
		int dig = 0;
		int sum = 0;
		while(num > 0)
		{
			dig = num % 10 ;
			sum = sum + dig;
			num = num/10;
		}
		return sum;
		
		
	}
}


/*
	Sample run
Enter the number is  = 156
Harsha number is 156
		
		
Enter the number is  = 123
Harsha number is not a 123

*/