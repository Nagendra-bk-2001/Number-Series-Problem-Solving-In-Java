class SwapNumber
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=0;
		
		// a=a+b;
		// b=a-b;	//Using Addition and Subtraction 
		// a=a-b;
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.print("The is an  " + a + " And " + b + " IS Swap Number");
	}
}


/*
	Sample Run
	Using Addition and Subtraction  
The is an  20 And 10 IS Swap Number

Using * and / 
The is an  20 And 10 IS Swap Number
*/