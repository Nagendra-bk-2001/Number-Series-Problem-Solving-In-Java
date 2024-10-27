import java.util.*;
class LargestTernaryOpe
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
		int largest=0;
		
		largest =(a>b)?(a>c ? a:c) :b>c?b:c;
		
		System.out.print("Largest number is " + largest);
	}
}


/*
	Sample Run
Enter the a number = 55
Enter the b number = 23
Enter the c number = 21
Largest number is 55

Enter the a number = 34
Enter the b number = 44
Enter the c number = 32
Largest number is 44

Enter the a number = 55
Enter the b number = 57
Enter the c number = 88
Largest number is 88

*/ 