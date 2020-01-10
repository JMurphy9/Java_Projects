class One {
	int a,b,c;
	
	public One() {
		System.out.println("Constructor run");
	}
	public void Message()	{
		System.out.print("Message run");
	}
}
class Constructor	{
	public static void main (String args[])	{
		One x = new One();
		One y = new One();
		y.Message();
	}
}
