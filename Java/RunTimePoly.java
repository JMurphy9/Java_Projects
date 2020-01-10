//create abstract parent class
//therefore we must override each abstract method
abstract class Drawing	{
	abstract public void Draw();
	
}

//Override abstract methods
class Line extends Drawing	{
	int a; 
	public void Draw()	{
		System.out.println("I am drawing a line");
	}
}
//each class must extend the parent
class Circle extends Drawing	{
	public void Draw()	{
		System.out.println("I am drawing a Circle");
	}
}
class Square extends Drawing	{
	public void Draw() {
		System.out.println("I am drawing a square");
	}
}

class RunTimePoly	{
	//requires an object as a parameter
	//as parent is abstract we must have a new class and override
	//the abstract method.
	public static void doDrawing(Drawing x)	{
		x.Draw();
	}
	//create object and send to doDrawing() method.
	public static void main(String args[])	{
		Line l = new Line();
		doDrawing(l);
		Circle c = new Circle();
		doDrawing(c);
		Square s = new Square();
		doDrawing(s);
	}
}