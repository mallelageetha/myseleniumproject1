package polymorphism;

public class Main {
	
	
	public static void main(String[] s) {
		TestSuite ts = new TestSuite();
		
		ts.runTestCases(new ChromeDriver());
		ts.runTestCases();
		
		ts.add(1, 2);
		ts.add(1, 2,3);
	}

}
