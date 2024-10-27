import java.util.*;
class ReverseNumber
{
	public static  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int dig = 0;
		int sum  = 0;
		int temp = 0;	
		temp =  sum;
		while(num>0)
		{
			dig = num % 10;
			sum = sum * 10 + dig;
			num = num /10;
		}
		
		System.out.print ("Reverse number is " + sum);
	}
}



/*
	Sample run
Enter the number = 94536
Reverse number is 63549
*/