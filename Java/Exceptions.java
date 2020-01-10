class Exceptions	{
	
	public static void main(String args[])	{
		
		int a,b,c;
		a = 4;
		b = 0;
		c = 0;
		try{
			c = a/b;
			
		}
		catch(ArithmeticException x)	{
			System.out.println("Please do not divide by 0!");
		}
		catch(IndexOutOfBoundsException k)	{
			System.out.println("Array is too small");
		}
		System.out.println("Result = " + c);
	}
}