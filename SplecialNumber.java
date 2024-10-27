//34
import java.util.*;
class SplecialNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int dig = 0;
		int product =1;
		int sum = 0;
		int temp = 0;
		temp = num;
		
		if (num >=10 && num <=99)
		{
			while(num>0)
			{
				dig = num % 10;
				sum = sum + dig;
				product = product * dig;
				num = num/10;
			}
			if ((sum + product) ==  temp)
			{
				System.out.print("This is  a SplecialNumber ");
			}
			else
			{
				System.out.print("This is not a SplecialNumber ");
			}
		}
	}
}


/*

Enter the number = 59
This is  a SplecialNumber

Enter the number = 61
This is not a SplecialNumber

Enter the number = 99
This is  a SplecialNumber

*/