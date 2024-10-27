import java.util.*;
class NarcissticNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int count=0;
		int sum=0;
		int dig=0;
		int temp =0;
		temp = num;
		
		while (num > 0)
		{
			count ++;
			num = num/10;
		}
		num = temp;
		
		while(num >0)
		{
			dig = num % 10;
			sum = sum + getPower(dig,count);
			num = num /10;
		}
		if(temp == sum)
		{
				System.out.println("Its a NarcissticNum = " + sum);
		}
		else
		{
			System.out.println("Its a not NarcissticNum = " + sum);
		}
	}
	public static int getPower(int dig,int count)
	{
		int power = 1;
		for(int i = 1;i<=count;i++)
		{
		power = power * dig;
		}
		return power;
		
	}
}




/*
	Sample run
Enter the number = 153
Its a NarcissticNum=153

Enter the number = 111
Its a not NarcissticNum=3

Enter the number = 1634
Its a NarcissticNum=1634
*/