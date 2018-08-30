package polymorphism;

public class TestSuite {

	
	public void runTestCases(WebDriver driver) {
		System.out.println("Dynamic polymorphism");
		driver.launchPage("www.google.come");
	}
	
	
	public void runTestCases() {
		WebDriver driver = new ChromeDriver();
		runTestCases(driver);
	}
	
	public void add(int a, int b) {
		System.out.println("adding two numbers");
	}
	
	public void add(int a, int b, int c) {
		System.out.println("adding three numbers");
	}
	
	
}
