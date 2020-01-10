
/*
*Program to take an integer, splitting the digits and adding the digits
*Divde A by 10 to get the first digit
*Perform modulus on to get the remainder
*/
class Mod {
public void Calc(int A) {
 int B, C;
	
	B = A/10;
	C = A%10;
	
	System.out.println("Digit 1: " + B + " Digit 2: " + C + " Result: " + (B+C));
}
}
class Digit {
	int R;
	public static void main (String args[]) {
	Mod R = new Mod();
	R.Calc(27);
	}	

}
