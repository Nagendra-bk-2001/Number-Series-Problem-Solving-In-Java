import java.util.*;
class CountDigite
{
	public static void main(String[]  args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int count = 0;
		int temp = 0;
		temp = num;
		
		while(num>0)
		{
			num = num / 10;
			count++;
		}
		
		System.out.print("Count of the number is " + temp + " \t=\t " + count);
	}
}




/*

Enter the number = 655544
Count of the number is 655544   =        6


*/