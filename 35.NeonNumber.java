import java.util.*;
class NeonNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int  dig = 0;
		int sum = 0;
		int temp = 0;
		temp = num;
		
		num = num *num;
		
		while(num>0)
		{
			dig = num % 10;
			sum = sum + dig;
			num = num/10;
		}
		 if(temp == sum)
		 {
			System.out.print("This is a Neon Number");
		 }
		 else
		 {
			System.out.print("This is not a Neon Number");
		 }
	}
}