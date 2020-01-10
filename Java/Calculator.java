//parent class
class Math{
	public void Addition(int a, int b)	{
		int c;
		c = a + b;
		System.out.println("Result = " + c);
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
	public void Multipilcation(int a, int b)	{
		int c;
		c = a * b;
		System.out.println("Result = " + c);
	}
	public void Division(int a, int b)	{
		int c;
		c = a / b;
		System.out.println("Result = " + c);
	}
}
class Math3 extends Math2	{
	public void Modulus(int a, int b)	{
		int c;
		c = a % b;
		System.out.println("Result = " + c);
	}
}

class Calculator {
	public static void main(String args[])	{
		//Create the object of the child which also
		//utilises every member of the parent
		Math3 M = new Math3();
		M.Addition(1,1);
		M.Subtraction(5,2);
		M.Multipilcation(2,5);
		M.Division(10,2);
		M.Modulus(20,5);
	}
}