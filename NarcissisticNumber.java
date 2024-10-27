import java.lang.Math;
import java.util.*;
class NarcissisticNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int dig = 0;
		int count = 0;
		int sum = 0;
		int temp = 0;
		temp =num;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num = temp;
		while( num > 0)
		{
			dig = num % 10;
			sum = sum + Math.pow(dig,count);
			num = num/10;
		}
		System.out.print("Narcissistic Number is " + sum + "=" + count);
	}	
}