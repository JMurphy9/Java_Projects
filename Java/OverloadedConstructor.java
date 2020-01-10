class QA {
	public QA() {
		System.out.println("no parameter");
	}
	public QA(int a, int b)	{
		System.out.println("2 parameter");
	}
}
class OverloadedConstructor	{
	public static void main (String args[])	{
		QA x = new QA(1,2);
		QA y = new QA();
	}
}
