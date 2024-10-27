import java.util.*;
class Palindrone
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int sum = 0;
		int rev = 0;
		int temp = 0;
		temp = num;
		
		while(num>0)
		{
			rev = num%10;
			sum = sum*10+rev;
			num = num/10;
		}
		if(temp == sum)
		{
			System.out.print("Its is a palindrone");
		}
			else{
					System.out.print("Its not a palindrone");
			}
	}
}