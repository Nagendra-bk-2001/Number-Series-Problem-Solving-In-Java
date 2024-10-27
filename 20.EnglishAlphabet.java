import java.util.*;
class EnglishAlphabet
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  Alphabet = ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 65 && ch <= 90)
		{
			System.out.print("This is UpperCase = " + ch);
		}
		else if (ch >= 97 && ch  <= 120)
		{
			System.out.print("This is LowerCase = " + ch);
		}
		else
		{
			System.out.print("invalid ");
		}
		
	}
}

/*

Enter the  Alphabet = A
This is UpperCase = A

Enter the  Alphabet = d
This is LowerCase = d
		
Enter the  Alphabet = 96
invalid


*/