class MultipleCondition	{
	public void ForLoop()	{
		
		int a,b,c;
		a=10;b=10;c=10;
		
		//0 or more initializers
		//0 or 1 conditions (use logical operators to include more
		//0 or more increments
		for (int i=0; i <= a && b < 100 && (c%2==0);i++, b++ , c-=2)	{
			System.out.println(i);
			System.out.println(b);
			System.out.println(c);
			//System.out.println("\n");
		}
	}
	public void ArrayLoop()	{
		int[] values = 
			{1,2,3,4,5,6,7,8,9,10};
		for (int item : values)	{
			System.out.println("Value is: " + item);
		}
	}
	//check if the second digit is 1
	//use "and gate", if output is true then second digit is 1
	//else second digit is 0
	
	public void BitCalc()	{
		int[] unknown = 
			{0,0,0,0,0,1,0,0};
		int[] check = 
			{0,0,0,0,0,0,1,0};
		if (unknown[6] == cehck[6])	{
			System.out.println("Good");
		} else
			System.out.println("Bad");
		
	}
	
}


class LoopPractice	{
	public static void main(String args[])	{
		MultipleCondition mc = new MultipleCondition();
		//mc.ForLoop();
		//mc.ArrayLoop();
		mc.BitCalc();
	}
}