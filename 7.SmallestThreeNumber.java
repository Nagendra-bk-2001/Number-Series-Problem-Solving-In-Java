import java.util.*;
class SmallestThreeNumber
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
		if(n1<n2 && n1<n3)
		{
			System.out.print(n1 +" is the Smallest Number");
		}
		else if(n2<n1 && n2<n3)
		{
			System.out.print(n2 +" is the Smallest Number");
		}
		else
		{
			System.out.print(n3 +" is the Smallest Number");
		}
		
	}
}


/*
		Sample Run
Enter the n1 number = 33
Enter the n2 number = 45
Enter the n3 number = 76
33 is the Smallest Number


Enter the n1 number = 85
Enter the n2 number = 41
Enter the n3 number = 76
41 is the Smallest Number


Enter the n1 number = 44
Enter the n2 number = 33
Enter the n3 number = 2
2 is the Smallest Number
*/