class Math{
	public void Addition(int a, int b)	{
		int c;
		c = a + b;
		System.out.println(c);
	}
	
	public void Subtraction(int a, int b)	{
		int c;
		c = a - b;
		System.out.println("Result = " + c);
	}
}
//Child of Math.
//Also parent of Math3
class Math2 extends Math	{
	public void Addition(int a, int b)	{
		int c;
		c = a + b;
		System.out.println("Result = " + c);
	}
}

class Overriding {
	public static void main(String args[])	{
		Math2 m = new Math2();
		m.Addition(5,2);
	}
}