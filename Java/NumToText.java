//Take a number and print the text of the whole number

class Calc	{
	public void GetNumber(int input){
		int number = input;
		String thouOutput = " ";
		String hundOutput = " ";
		String tenOutput = " ";
		String lastOutput = " ";

		String and = "";

		String thou = " thousand";
		String hund = " hundred";
		String ty = "ty ";
		String teen = "teen ";

		String one = "one";
		String two = "two";
		String three = "three";
		String four = "four";
		String five = "five";
		String six = "six";
		String seven = "seven";
		String eight = "eight";
		String nine = 	"nine";
		String ten = "ten";

		String eleven = "eleven";
		String twelve = "twelve";
		String thirteen = "thirteen";
		
		String twe = "twen";
		String thir = "thir";
		String frty = "for";
		String fif = "fif";
		String eigh = "eigh";
		String nin = "nin";


		int a, b, c, d, e, f;
	
		a = input/1000;		//Divide input to get first digit - thousands
		b = input%1000;		//Modulus to get remainder
		c = b/100;			//Divie b to get next digit - hundreds
		d = b%100;			//Modulus to get remainder
		e = d/10;			//divide to get tens
		f = d%10;			// last digit
		
		//thousands
		if (a == 0)	{
			thouOutput = " ";
		}
		if (a == 1)	{
			thouOutput = (one + thou);
		}
		if (a == 2)	{
			thouOutput = (two + thou);
		}
		if (a == 3)	{
			thouOutput = (three+ thou);
		}
		if (a == 4)	{
			thouOutput = (four + thou);
		}
		if (a == 5)	{
			thouOutput = (five + thou);
		}
		if (a == 6)	{
			thouOutput = (six + thou);
		}
		if (a == 7)	{
			thouOutput = (seven + thou);
		}
		if (a == 8)	{
			thouOutput = (eight + thou);
		}
		if (a == 9)	{
			thouOutput = (nine + thou);
		}

		//hundreds
		if ((a == 0) && (c == 0)) {
			thouOutput = " ";
			hundOutput = " ";
		}
		if ((c == 0) && (a > 0)) {
			hundOutput = (" and ");
		}
		if (c == 1)	{
			hundOutput = (", " + one + hund);
		}
		if (c == 2)	{
			hundOutput = (", " + two + hund);
		}
		if (c == 3)	{
			hundOutput = (", " + three + hund);
		}
		if (c == 4)	{
			hundOutput = (", " + four + hund);
		}
		if (c == 5)	{
			hundOutput = (", " + five + hund);
		}
		if (c == 6)	{
			hundOutput = (", " + six + hund);
		}
		if (c == 7)	{
			hundOutput = (", " + seven + hund);
		}
		if (c == 8)	{
			hundOutput = (", " + eight + hund);
		}
		if (c == 9)	{
			hundOutput = (", " + nine + hund);
		}

		if ((e == 0) && (f == 0)){

		}

		//tens
		if (e == 0)  {
			tenOutput = (" and ");
		}
		if (e == 1)	{
			tenOutput = (ten);
		}
		if (e == 2)	{
			tenOutput = (twe + ty + " ");
		}
		if (e == 3)	{
			tenOutput = (thir + ty + " ");
		}
		if (e == 4)	{
			tenOutput = (frty + ty + " ");
		}
		if (e == 5)	{
			tenOutput = (fif + ty + " ");
		}
		if (e == 6)	{
			tenOutput = (six + ty + " ");
		}
		if (e == 7)	{
			tenOutput = (seven + ty + " ");
		}
		if (e == 8)	{
			tenOutput = (eigh + ty + " ");
		}
		if (e == 9)	{
			tenOutput = (nin + ty + " ");
		}

		//last digit
		if (f == 1) {
			lastOutput = (one);
		}
		if (f == 2) {
			lastOutput = (two);
		}
		if (f == 3) {
			lastOutput = (three);
		}
		if (f == 4) {
			lastOutput = (four);
		}
		if (f == 5) {
			lastOutput = (five);
		}
		if (f == 6) {
			lastOutput = (six);
		}
		if (f == 7) {
			lastOutput = (seven);
		}
		if (f == 8) {
			lastOutput = (eight);
		}
		if (f == 9) {
			lastOutput = (nine);
		}

		//blank
		if ((e == 0) && (f == 0))	{
			tenOutput = " ";
			lastOutput = " ";
		}
		
		//teens
		//if ((a > 0) || (c > 0)) {
		//	and = " and ";
		//}
		if ((e == 1) && (f == 1))	{
			tenOutput = eleven;
			lastOutput = " ";
		}
		if ((e == 1) && (f == 2))	{
			tenOutput = twelve;
			lastOutput = " ";
		}
		if ((e == 1) && (f == 3))	{
			tenOutput = thirteen;
			lastOutput = " ";
		}
		if ((e == 1) && (f == 4))	{
			tenOutput = four + teen;
			lastOutput = " ";
		}
		if ((e == 1) && (f == 5))	{
			tenOutput = fif + teen;
			lastOutput = " ";
		}
		if ((e == 1) && (f == 6))	{
			tenOutput = six + teen;
			lastOutput = " ";
		}
		if ((e == 1) && (f == 7))	{
			tenOutput =  seven + teen;
			lastOutput = " ";
		}
		if ((e == 1) && (f == 8))	{
			tenOutput = eigh + teen;
			lastOutput = " ";
		}
		if ((e == 1) && (f == 9))	{
			tenOutput = nin + teen;
			lastOutput = " ";
		}

		System.out.println(thouOutput + hundOutput  + and + tenOutput +  lastOutput);

	}

} 

class NumToText {
	public static void main (String args[]) {
		Calc R = new Calc();
		R.GetNumber(9100);

	}
}