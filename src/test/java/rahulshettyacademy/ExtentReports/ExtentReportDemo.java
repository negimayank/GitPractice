package rahulshettyacademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportDemo {
	ExtentReports extentReport;
	
	@BeforeTest
	public void config() {
		
		//ExtentReports,  ExtentSparkReporters
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("WebAutomationPractice Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Tester", "Mayank");
		System.out.println("Git hub practice 1");
		System.out.println("Git hub practice 2");
		System.out.println("Git hub practice 3");
		System.out.println("Git hub practice 4");
		System.out.println("Git hub practice 5");
		System.out.println("Git hub practice 6");
	}
	
	@Test
	public void initialDemo() {
		
		ExtentTest test=extentReport.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumFiles\\ChromeDriver\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		//driver.close();
		test.fail("Results do not match");
		extentReport.flush();
		
	}

}
