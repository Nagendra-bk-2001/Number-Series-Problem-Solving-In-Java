import java.util.*;
class AutomorphicNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int dig = 0;
		int square = 1;
		int temp =0;
		temp = num;
		
		square = num*num;
		dig = square % 10;
		
		if(dig == num)
		{
			System.out.print("This is a  Automorphic Number ");
		}
		else
		{
			System.out.print("This is not a  Automorphic Number ");
		}
		
	}
} 



/*

Enter the number = 5
This is a  Automorphic Number

Enter the number = 6
This is a  Automorphic Number

Enter the number = 3
This is not a  Automorphic Number

*/