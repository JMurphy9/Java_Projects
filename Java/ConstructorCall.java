class QAManchester	{
	public QAManchester()	{
		//calls next constructor before executing next line
		this(7);
		System.out.println("1st");
	}
	public QAManchester(int a)	{
		//calls next constructor before executing next line
		this(8,9);
		System.out.println("2nd");
	}
	public QAManchester(int a, int b)	{
		System.out.println("3rd");
		//returns to previous constructor calls to execute the following lines
	}
}
class ConstructorCall	{
	public static void main(String args[]) 	{
		QAManchester x = new QAManchester();
	}
}

		