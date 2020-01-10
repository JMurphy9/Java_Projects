class Calc	{
	//iterate through given parameters and print out each even and odd
	//number in the range of those two parameters.
	//mod of 2 == 0 is an even number
	//else is an odd number.
	public void getRange(int a, int b)	{
		int j;
		
		//if they are both the same
		//print the first input
		if (a == b)	{
			j=b+1;
			for (int i = a; i < j; i++)	{
				if (i % 2 == 0)	{
					System.out.println(i + ": Even");
				} else	
					System.out.println(i + ": Odd");	
			}
		}
		
		if (a > b)	{
			j = b+1;
			for (int i = a; i < j; i++)	{
				if (i % 2 == 0)	{
					System.out.println(i + ": Even");
				} else	
					System.out.println(i + ": Odd");	
			}
		} else 
			//condition if b is greater than an
			//reverse the order.
			j = b+1;
			for (int p = a; p > j; p--)	{
				if (p % 2 == 0)	{
					System.out.println(p + ": Even");
				} else	
					System.out.println(p + ": Odd");
			}
			
	}
}


class Range	{
	public static void main (String args[])	{
		Calc x = new Calc();
		x.getRange(22,22);
	}
}