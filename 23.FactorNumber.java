import java.util.*;
class FactorNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		
		for(int i =1;i<=num;i++)
		{
			if(num % i ==0)
				System.out.println(i);
		}
		
		// System.out.println("The factors number is " + num );
	}
}


/*
Enter the number = 10
1
2
5
10


Enter the number = 20
1
2
4
5
10
20


Enter the number = 11
1
11

*/