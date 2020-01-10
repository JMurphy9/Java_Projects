class Bank	{
	//a static member is not created in the object
	//it is created in RAM and all objects in the class
	//have access to that static member
	//i.e. it is a global variable
	static int dollar;
	public void setDollar(int a)	{
		dollar = a;
	}
	public void Amount(int amo)	{
		System.out.println(amo*dollar);
	}
}
class StaticMembers	{
	public static void main(String args[]) {
		Bank HSBC = new Bank();
		Bank Natwest = new Bank();
		
		HSBC.setDollar(75);
		HSBC.Amount(2);
		
		Natwest.Amount(4);
		Natwest.setDollar(100);
	}
}
