import java.util.*;
class FibonacciSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int range = sc.nextInt();
		getFibse(range);
	}
	public static int getFibse(int range)
	{
		int a=0;
		int b=1;
		int sum =0;
		
		for(int i =1;i<=range;i++){
			sum = a+b;
			System.out.println("Fibonacci Series number is " + sum);
			a=b;
			b=sum;
			}
		return sum;
	}
}


/*

Enter the number = 10
Fibonacci Series number is 1
Fibonacci Series number is 2
Fibonacci Series number is 3
Fibonacci Series number is 5
Fibonacci Series number is 8
Fibonacci Series number is 13
Fibonacci Series number is 21
Fibonacci Series number is 34
Fibonacci Series number is 55
Fibonacci Series number is 89

*/