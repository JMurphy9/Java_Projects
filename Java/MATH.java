class maths { 
	public void Addition(int x, int y) { 
		int c;
		c = x + y;
		System.out.println("Result: " + c);
	}
	public void Subtraction(int x, int y) { 
		int c;
		c = x - y;
		System.out.println("Result: " + c);
	}
	public void Division(int x, int y) { 
		int c;
		c = x / y;
		System.out.println("Result: " + c);
	}
	public void Multiplication(int x, int y) { 
		int c;
		c = x * y;
		System.out.println("Result: " + c);
	}
}
class MATH { 
	public static void main(String args[]) {
		maths Add = new maths();
		maths Subtract = new maths();
		maths Divide = new maths();
		maths Multiply = new maths();
			
		Add.Addition(10, 10);
		Subtract.Subtraction(10, 10);
		Divide.Division(10, 10);
		Multiply.Multiplication(10, 10);
	}
}