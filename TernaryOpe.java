import java.util.*;
class SmallestTernaryOpe
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the a number = ");
		int a = sc.nextInt();
		System.out.print("Enter the b number = ");
		int b = sc.nextInt();
		System.out.print("Enter the c number = ");
		int c = sc.nextInt();
		int smallest=0;
		
		smallest =(a<b)?(a<c ? a:c) :b<c?b:c;
		
		System.out.print("Smallest number is " + smallest);
	}
}



/*
Enter the a number = 33
Enter the b number = 54
Enter the c number = 23
Smallest number is 23


Enter the a number = 33
Enter the b number = 23
Enter the c number = 54
Smallest number is 23


Enter the a number = 23
Enter the b number = 54
Enter the c number = 33
Smallest number is 23
*/