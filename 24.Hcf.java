import java.util.*;
clsss Hcf
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the A number = ");
		int a = sc.nextInt();
		System.out.print("Enter the B number = ");
		int b = sc.nextInt();
		int hcf =1;
		
		for (int i = 1; i<=a && i<=b ; i++)
		{
			if(a%i==0 && b%i==0)
			hct = i;
		}
		System.out.print("HCF number is a " + hcf);
	}
}