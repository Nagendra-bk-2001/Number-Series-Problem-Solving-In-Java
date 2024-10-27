import java.util.*;
class Multiplication 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
		System.out.println(num + "*" + i + "=" + (num*i));
		}
	}
}


/*
	Sample Run
Enter the number = 19
19*1=19
19*2=38
19*3=57
19*4=76
19*5=95
19*6=114
19*7=133
19*8=152
19*9=171
19*10=190
*/