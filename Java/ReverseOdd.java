class Reverse	{
	public void getOdds(int input)	{
	
	int i;
	int j = input;
	int k;
		//increment input by one
		for (i = 0; i < j; i++)	{
			//if even
			if (i % 2 == 0)	{
				//print all current values
				for (k = 1; k <= i; k++)	{
					System.out.print(k);
				}
			//if odd
			} else
				//print the reverse of the values if they are odd
				for (k = i; k > 0; k--)	{
					System.out.print(k);
				}
			//print new line for every increment of the loop	
			System.out.print("\n");		
		}
	}	
}
class ReverseOdd	{
	public static void main (String args[])	{
		Reverse x = new Reverse();
		x.getOdds(10);
	}
}