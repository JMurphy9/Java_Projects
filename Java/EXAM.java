class Exam {
	private int PHY, CHE, MAT;
	public void Physics(int A) {
		if (A < 150) {
			PHY = A;
		} else {
			System.out.println("Invalid Marks!");
		}
	}
	public void Chemistry(int B) {
		if (B < 150) {
			CHE = B;
		} else {
			System.out.println("Invalid Marks!");
		}
	}
	public void ShowResult() {
	int Res, Per;
	Res = PHY + CHE;
	Per = (PHY + CHE) / 300;
	
	
	System.out.println("Results: " + Res);
	System.out.println("Percentage: " + Per + "%");
	}
}

class anything {
	public static void main (String args[]) {
		Exam James = new Exam();
		Exam Peter = new Exam();
		
		James.Physics(150);
		James.Chemistry(150);
		Peter.Physics(75);
		Peter.Chemistry(75);
		
		James.ShowResult();
		Peter.ShowResult();
	}
}


	