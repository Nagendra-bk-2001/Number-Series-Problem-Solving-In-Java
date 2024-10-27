import java.util.*;
class LargestThreeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n1 number = ");
		int n1 = sc.nextInt();
		System.out.print("Enter the n2 number = ");
		int n2 = sc.nextInt();
		System.out.print("Enter the n3 number = ");
		int n3 = sc.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.print(n1 +" is the Largest Number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.print(n2 +" is the Largest Number");
		}
		else
		{
			System.out.print(n3 +" is the Largest Number");
		}
		
	}
}