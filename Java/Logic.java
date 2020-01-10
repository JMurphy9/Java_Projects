class Results { 

private String failedSubjects = " ";
private int Phy, Che, Mat;
private int Failed, Invalid;


public void Physics(int p) {
	if (p >= 0 && p <= 150) {
		if (p < 65) {
			Failed++;
			failedSubjects = "Physics: " + p + " "; 
		} else {
			Phy = p; 
		}
	} else {
		Invalid++;
	}
	}
	


public void Chemistry(int c) {
	if (c >= 0 && c <= 150) {
		if (c < 65) {
			Failed++;
			failedSubjects += ", Chemistry: " + c + " "; 
		} else {
			Che = c; 
		}
	} else {
		Invalid++;
	}
}

public void Maths(int m) {
	if (m >= 0 && m <= 150) {
		if (m < 65) {
			Failed++;
			failedSubjects += ", Maths: " + m + " "; 
		} else {
			Mat = m; 
		}
	} else {
		Invalid++;
	}
}


public void ShowResults() {
	int Res;
	float Per;
	
	if (Invalid > 0) {
		System.out.println("Invalid Mark");
	} else if (Failed == 0) {
		
		Res = Che + Phy + Mat;
		Per = (float)((Phy + Che + Mat) / 450) * 100;
		
		System.out.println("Total Marks: " + Res);
		System.out.println("Percentage: " + Per + "%");
		
	}	else  {
		System.out.println("Failed Subjects: " + failedSubjects);
	}
		
	if (Failed == 2) {
		System.out.print("Retake Course!");
	}
	if (Failed == 3) {
		System.out.print("Go home my friend");
	}
	
	}	
}


class Logic {
	public static void main (String args[]) {
		Results R = new Results();
		
		R.Physics(8);
		R.Chemistry(90);
		R.Maths(70);
		R.ShowResults();
		
	}
}
