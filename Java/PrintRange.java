//take an input and print the odd numbers singlarly
//then print the even numbers as a list
//e.g. (1), (12), (3), (1234)

class Range	{
	public void getRange(int input)	{
	
	int i;
	int j = input;
	int k;
		for (i = 0; i < j; i++)	{
			if (i % 2 == 0)	{
				for (k = 1; k <= i; k++)	{
				//set k = 1 otherwise it will follow the same loop as previous
					System.out.print(k);
				}
			} else	
				System.out.println("\n" + i);	 
		}
	}
	
}


class PrintRange	{
	public static void main(String args[])	{
		Range x = new Range();
		x.getRange(18);
	}
}