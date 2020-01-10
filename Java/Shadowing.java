class Tree {
	int a,b;
	public void What()	{
		int a,c;
		this.a = 15;
	}
	public void Message()	{
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
}
class Shadowing {
	public static void main(String args[])	{
		Tree x = new Tree();
		x.What();
		x.Message();
	}
}