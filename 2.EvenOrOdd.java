import java.util.*;
class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.print(num +" This is EVEN number ");
		}
		else
		{
			System.out.print(num +" This is ODD number ");
		}
	}
}


/*
	Sample run
Enter the number = 12
12 This is EVEN number

Enter the number = 13
13 This is ODD number
*/