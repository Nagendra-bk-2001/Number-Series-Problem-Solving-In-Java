import java.util.*;
class LcmNumbern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the A number = ");
		int a = sc.nextInt();
		System.out.print("Enter the B number = ");
		int b = sc.nextInt();
		int hcf =0 ;
		int lcm = 0;
		for (int i = 1; i<=a && i<=b ; i++)
		{
			if(a%i==0 && b%i==0)
			lcm  = a*b/hcf;
			
		}
		
		// System.out.print("HCF number is a " + hcf);
		System.out.print(lcm);
	}
}