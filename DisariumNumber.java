import java.util.*;
class DisariumNumber
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num= sc.nextInt();
		int dig = 0;
		int sum = 0;
		int count = 0;
		int temp =0;
		temp = num ;
		
		while(num > 0)
		{
			count++;
			num = num/10;
		}
		num = temp;
		while(num > 0)
		{
			dig = num %10;
			sum = sum + getPower(dig,count);
			num = num/10;
			count--;
			
		}
		if(temp==sum)
		{
			System.out.print("This is a Disarium number = " + sum);
		}
		else
		{
			System.out.print("This is not a Disarium number = " + sum);
		}
		
	}
	
	public static int getPower(int dig,int count)
	{
		int power =1;
		for(int i = 1;i<=count;i++)
		{
			power = power * dig;
			
		}
		return power;
	}
}


/*


Enter the number = 89
This is a Disarium number = 89


Enter the number = 135
This is a Disarium number = 135


Enter the number = 175
This is a Disarium number = 175

Enter the number = 518
This is a Disarium number = 518

Enter the number = 234
This is not a Disarium number = 75
*/