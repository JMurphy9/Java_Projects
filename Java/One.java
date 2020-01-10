class Results { 
	int PHY, CHE, MAT;
	public void ShowResults() {
	int Res;
	
	Res = PHY + CHE + MAT;
	
	System.out.println("Results: " + Res);
	}
}
class ONE { 
	public static void main(String x[]) {
	Results Peter;
	Results James;
	
	Peter = new Results();
	James = new Results();
	
	Peter.PHY = 75;
	Peter.CHE = 60;
	Peter.MAT = 90;
	James.PHY = 95;
	James.CHE = 92;
	James.MAT = 105;
	
	Peter.ShowResults();
	James.ShowResults();
	}
}