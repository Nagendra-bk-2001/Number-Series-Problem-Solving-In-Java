import java.util.*;
class BuzzNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num =sc.nextInt();
		int id =num%10;
		
		if(num%7==0 || id==0)
		{
				System.out.print("Its is Buzz number");
		}
			else
			{
				System.out.print("Its not a  Buzz number");
			}
	}
}


/*
Enter the number = 77
Its is Buzz number


Enter the number = 23
Its not a  Buzz number


Enter the number = 21
Its is Buzz number
*/