import java.util.*;
class LcmNumber
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first num = ");
		int a = sc.nextInt();
		System.out.print("Enter second num = ");
		int b = sc.nextInt();
		int g = 0;
		for(int i = 1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				g=i;
			}
		}
		int lcm = a*b/g;  
		System.out.println(lcm);
	}
}
	
