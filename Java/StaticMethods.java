class Test42	{
	//member must be static to be used in a static method
	//although it can be used by a non static method (Message2())
	static int a;
	public static void Message()	{
		a = 16;
		System.out.println("Static Method");
		//a must be static to be used in a static method
		System.out.println("Instnace member: " + a);
		
	}
	public void Message2()	{
		System.out.println("Non static method");
		//the static member will remain as the value given in the 
		//
		System.out.println(a);
	}
}

class StaticMethods {
	public static void main(String args[])	{
		Test42 x = new Test42();
		x.Message();
		x.Message2();
	}
}