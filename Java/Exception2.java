class Exception2	{
	public static void main(String args[])	{
	
	int a,b,c;
	a=b=c=0;
	
	try	{
		//expecting an input from the run time
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = a/b;
		System.out.println(c);
	}
	//if a string is sent
	catch(NumberFormatException e)	{
		System.out.println("Only send numeric values!");
	}
	//try to divide by 0
	catch(ArithmeticException e)	{
		System.out.println("Please do not divide by 0");
	}
	//try to send less that two values. we are expecting two values
	catch(ArrayIndexOutOfBoundsException e)	{
		System.out.println("Please input two numeric values");
	}
	//NB: if three values are sent it reads the first two and
	//ignores the third value
	
	//
	}
}