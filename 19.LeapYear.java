import java.util.*;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year = ");
		int num =  sc.nextInt();
		
		if (num % 100 == 0 )
		{
			if(num %400 == 0)
			{
				System.out.print("This is Leap Year = " + num );
			}
			else
			{
				System.out.print("This is not  Leap year = " + num);
			}
		}
		else
		{
			if(num % 4 == 0)
			{
				System.out.print("This is Leap Year =  " + num);
			}
			else
			{
				System.out.print("This is not Leap Year = " + num );
			}
			
		}
	}
}