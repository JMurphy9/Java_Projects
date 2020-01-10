interface GearBox	{
	void changeGear();
}
class ManualCar implements GearBox	{
	public void changeGear()	{
		System.out.println("Manual gear change");
	}
}
class AutomaticCar implements GearBox	{
	public void changeGear()	{
		System.out.println("Automatic gear change");
	}
}

	
class Interfaces	{
	public static void main(String args[])	{
		ManualCar mc = new ManualCar();
		AutomaticCar ac = new AutomaticCar();
		
		mc.changeGear();
		ac.changeGear();
	}
}