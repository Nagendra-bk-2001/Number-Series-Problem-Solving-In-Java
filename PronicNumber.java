import java.util.*;
class PronicNumber
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		
		// for(int i =0;i<=num;i++)
		// {
			
		// System.out.println(i*(i+1) + "");
		// }
		
		getPronic(num);
	}
	public static void getPronic(int num)
	{
		for(int i =0;i<=num;i++)
		{
			System.out.println(i*(i+1) + "");
		}
	}
}

	 

/*

Enter the number = 9
0
2
6
12
20
30
42
56
72
90


*/