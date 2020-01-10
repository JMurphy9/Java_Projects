class Demo	{
	public void DisplayArray()	{
		//create an array
		int[] Array;
		//allocate 10 integer spaces to that array
		Array = new int[3];
		//assign value to array index
		Array[0] = 10;
		Array[1] = 20;
		Array[2] = 30;
		//print
		System.out.println(Array[0]);
		System.out.println(Array[1]);
		System.out.println(Array[2]);
	}
	public void ParamArray(String a, String b)	{
		String[] PArray;
		PArray = new String[10];
		PArray[0] = a;
		PArray[1] = b;
		
		System.out.println(PArray[0] + " " + PArray[1]);
		
	}
	public void LoopArray()	{
		int[] Array;
		//allocate 10 integer spaces to that array
		Array = new int[3];
		//assign value to array index
		Array[0] = 10;
		Array[1] = 20;
		Array[2] = 30;
		
		for (int i = 0; i < Array.lenth; i++)	{
			System.out.println(Array);
		}
	}
}

class Arrays {	
	public static void main (String args[])	{
		Demo d = new Demo();
		d.DisplayArray();
		d.ParamArray("Jack","Murphy");
		int A=5;
		System.out.println(A++);
	}
}