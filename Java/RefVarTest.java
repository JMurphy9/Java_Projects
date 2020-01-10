//parent class
class Math	{
	public void Add(int a, int b)	{
		System.out.println(a+b);
	}
	public void Sub(int a, int b)	{
		System.out.println(a-b);
	}
}
//child of Math
class QA extends Math	{
	public void Div(int a, int b)	{
		System.out.println(a/b);
	}
}


class RefVarTest	{
	public static void main(String args[])	{
		//Reference variable also stores any the address of any 
		//children of the parent class. 
		Math R;
		//you can create the object of a the child and the parent 
		//object will also be created
		R = new QA();
		R.Add(4,2);
		R.Sub(10,2);
		//however, can only use the inherited class (from Math).
		R.Div(9,3);
	}
}