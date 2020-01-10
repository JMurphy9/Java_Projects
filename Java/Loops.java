//while(condition) {
//statemant
//}
class Example {
	public void For1()	{
		//initialise, termination condition, increment
		for(int i = 0; i < 10; i++)	{
			System.out.print(i + " ");
		}	
	}
	public void While1()	{
		int y = 10;
		while (y < 15)	{
			System.out.println(y + " ");
			y++;
		}
	}
	public void Switch1(int month)	{
		String monthString;
		switch	(month)	{
			case 1:  monthString = "January";
					//if conidition is fulfilled, end loop
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
	}
	public void Continue1()	{
		for(int z=0; z < 10; z++) {
			if (z % 2 == 0) {
				//moves to the next iteration of the loop
				continue;
			}
			System.out.print(z + " ");
		}
	}
}
class Loops	{
	public static void main(String args[])	{
		Example a = new Example();
		Example b = new Example();
		Example c = new Example();
		Example d = new Example();
		
		a.For1();
		b.While1();
		c.Switch1(9);
		d.Continue1();
	}
}
