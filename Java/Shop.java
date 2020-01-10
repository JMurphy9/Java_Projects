class Till {
	public void Calc(float input, float cost) {
	float balance = input - cost;
	float notes;
	
		if (balance >= 50) {
			notes = (int)(balance/50);
			System.out.println("50 Pounds: "+ notes);
			balance -= (notes*50);
		}
		if (balance >= 20) {
			notes = (int)(balance/20);
			System.out.println("20 Pounds: "+ notes);
			balance -= (notes*20);
		}
		if (balance >= 10) {
			notes = (int)(balance/10);
			System.out.println("10 Pounds: "+ notes);
			balance -= (notes*10);
		}
		if (balance >= 5) {
			notes = (int)(balance/5);
			System.out.println("5 Pounds: "+ notes);
			balance -= (notes*5);
		}
		if (balance >= 2) {
			notes = (int)(balance/2);
			System.out.println("2 Pounds: "+ notes);
			balance -= (notes*2);
		}
		if (balance >= 1) {
			notes = (int)(balance/1);
			System.out.println("1 Pounds: "+ notes);
			balance -= (notes*1);
		}
		
		//coins
		if (balance >= 0.5) {
			notes = (float)(balance/0.5);
			System.out.println("50 Pence: "+ notes);
			balance -= (notes*0.5);
		}
		if (balance >= 0.2) {
			notes = (float)(balance/0.2);
			System.out.println("20 Pence: "+ notes);
			balance -= (notes*0.2);
		}
		if (balance >= 0.1) {
			notes = (float)(balance/0.1);
			System.out.println("10 Pence: "+ notes);
			balance -= (notes*0.1);
		}
		if (balance >= 0.05) {
			notes = (float)(balance/0.05);
			System.out.println("5 Pence: "+ notes);
			balance -= (notes*0.05);
		}
		if (balance >= 0.02) {
			notes = (float)(balance/0.02);
			System.out.println("2 Pence: "+ notes);
			balance -= (notes*0.02);
		}
		if (balance >= 0.01) {
			notes = (float)(balance/0.01);
			System.out.println("1 Pence: "+ notes);
			balance -= (notes*0.01);
		}
	}
}

class Shop {
	public static void main (String args[]) {
		Till R = new Till();
		R.Calc(20f,12f);
		
	}
}