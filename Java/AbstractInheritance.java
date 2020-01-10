abstract class Math{
	abstract public void Addition(int a, int b);
	abstract public void Subtraction(int a, int b);
	public void Divide(int a, int b)	{
		int c;
		c = a/b;
		System.out.println("Result = " + c);
	}
}
//we must override an abstract method for the program to 
//compile. We cannot compile an abstract class
//we cannot compile an abstract method without overriding it

class Math2 extends Math	{
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

class AbstractInheritance	{
	public static void main(String args[])	{
		Math2 m = new Math2();
		m.Addition(2,5);
		m.Subtraction(10,4);
		m.Divide(15,3);
	}
}