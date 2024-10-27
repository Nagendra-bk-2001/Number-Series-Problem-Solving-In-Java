import java.util.*;
class HcfNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the A number = ");
		int a = sc.nextInt();
		System.out.print("Enter the B number = ");
		int b = sc.nextInt();
		int hcf =0 ;
		
		for (int i = 1; i<=a && i<=b ; i++)
		{
			if(a%i==0 && b%i==0)
			hcf = i;
		}
		System.out.print("HCF number is a " + hcf);
	}
}



/*


Enter the A number = 18
Enter the B number = 12
HCF number is a 6


*/