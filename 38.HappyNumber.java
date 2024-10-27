import java.util.*;
class HappyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		while(num != 1 && num !=4)
		{
			num =getHappyNumber(num);
		}
		if(num ==1)
		{
			System.out.print("This is a Happy Number ");
		}
		else
		{
			System.out.print("This is  not a Happy Number ");
		}
	}
	
	public static int getHappyNumber(int num)
	{
		int dig= 0;
		int  sum =0;
		
		while(num>0)
		{
			dig =num%10;
			sum = sum + (dig*dig);
			num = num/10;
		}
		return sum;
	}
}