import java.util.*;
class ArmStrong
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num =  sc.nextInt();
		// int num = 153;
		int sum =0;
		int dig = 0;
		int temp = 0;
		temp = num;
		
		while(num > 0)
		{
			dig = num %10;
			dig = dig * dig * dig;
			sum = sum + dig;
			num = num/10;
		}
		if(temp == sum )
		{
			System.out.print("This is ArmStrong number");
		}
		else
		{
			System.out.print("This is  not ArmStrong number");
		}
	}
}


/*

Enter the number = 153
This is ArmStrong number

Enter the number = 0
This is ArmStrong number

Enter the number = 1
This is ArmStrong number

Enter the number = 370
This is ArmStrong number

Enter the number = 371
This is ArmStrong number

Enter the number = 342
This is  not ArmStrong number
*/