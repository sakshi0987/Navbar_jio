package navbar_buttons;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import jiomartpages.Jiomart_Basepage;
import jiomartpages.Jiomart_Objectpage;

public class Electronics_moduletest extends Jiomart_Basepage
{
	static ExtentTest log ;
	static ExtentReports report ;
	Navbar_actions test_actions;
	Jiomart_Objectpage obj;
	
	@BeforeSuite
	public void startTest()
	{
		report = new ExtentReports("./reports\\TestcaseExecutionReport.html",true);
 	}
	
	@BeforeClass
	public void Homepage() throws IOException
	{
		Launchpage();
		obj = new Jiomart_Objectpage();
		test_actions=new Navbar_actions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test(priority=1)
	void logoverify()
	{
		log = report.startTest("logo is displayed");
		test_actions.logocheck();
		log.log(LogStatus.PASS, "Test Case passed");	
	}
	
	@Test(priority=2)
	void sort_item() throws InterruptedException
	{
		log = report.startTest("item sort successfully and item is displayed");
		test_actions.sort_item();
		log.log(LogStatus.PASS, "Test Case passed");	
	}
//	
//	@Test(priority=3)
//	void add_item1() throws InterruptedException
//	{
//		log = report.startTest("1st item is added successfully");
//		test_actions.add_item1();
//		System.out.println("item1 added successfully");
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=4)
//	void add_item2() throws InterruptedException
//	{
//		log = report.startTest("2nd item is added successfully");
//		test_actions.add_item2();
//		System.out.println("item2 added successfully");
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=5)
//	void add_item3() throws InterruptedException
//	{
//		log = report.startTest("3rd item is added successfully");
//		test_actions.add_item3();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=6)
//	void gotocart() throws InterruptedException
//	{
//		log = report.startTest("cart is opened successfully");
//		test_actions.gotocart();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=7)
//	void print_subtotal() throws InterruptedException
//	{
//		log = report.startTest("subtotal is printed successfully");
//		test_actions.print_subtotal();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=8)
//	void beauty_module() throws InterruptedException
//	{
//		log = report.startTest("beauty module is opened successfully");
//		test_actions.beauty_module();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//
//	@Test(priority=9)
//	void gotocart1() throws InterruptedException
//	{
//		log = report.startTest("cart is opened successfully");
//		test_actions.gotocart1();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=10)
//	void home_improvement() throws InterruptedException
//	{
//		log = report.startTest("home improvement module is opened successfully");
//		test_actions.home_improvement();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=11)
//	void carfresh_totalitem() throws InterruptedException
//	{
//		log = report.startTest("carfresh totalitem is displayed ");
//		test_actions.sortfresh_item();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=12)
//	void add_carfreshitem() throws InterruptedException
//	{
//		log = report.startTest("carfresh item is displayed ");
//		test_actions.add_carfreshitem();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=13)
//	void add_electricalitem() throws InterruptedException
//	{
//		log = report.startTest("electrical item is displayed ");
//		test_actions.electrical_item();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=14)
//	void add_carpentryitem() throws InterruptedException
//	{
//		log = report.startTest("carpentry filter is opened ");
//		test_actions.carpentry_click();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=15)
//	void sort_carpentryitem() throws InterruptedException
//	{
//		log = report.startTest("carpentry item is sorted ");
//		test_actions.sort_carpentry_item();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=16)
//	void apply_filter() throws InterruptedException
//	{
//		log = report.startTest("all filter is applied");
//		test_actions.apply_filters();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=17)
//	void slider() throws InterruptedException
//	{
//		log = report.startTest("slider is moved");
//		test_actions.slider();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=18)
//	void addcarpentry_item() throws InterruptedException
//	{
//		log = report.startTest("items are added");
//		test_actions.addcarpentry_item();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=19)
//	void cart_item() throws InterruptedException
//	{
//		log = report.startTest("cart is opened");
//		test_actions.gotocart();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
//	
//	@Test(priority=20)
//	void print_subtotall() throws InterruptedException
//	{
//		log = report.startTest("subtotal of cart");
//		test_actions.print_subtotal1();
//		log.log(LogStatus.PASS, "Test Case passed");	
//	}
	
	
	@AfterMethod
	public void getResult(ITestResult result ) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakesScreenshot tc = (TakesScreenshot)driver;
			File target = tc.getScreenshotAs(OutputType.FILE);
		    FileHandler.copy(target, new File(result.getName()+".png"));
			
			log.log(LogStatus.FAIL, "Test Case failed"+result.getName());
			log.log(LogStatus.FAIL, "Test Case failed"+result.getThrowable());
		
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			log.log(LogStatus.SKIP, "Test Case failed"+result.getName());
			log.log(LogStatus.SKIP, "Test Case failed"+result.getThrowable());
		}
	}
	
	@AfterSuite
	void EndTest()
	{
	report.endTest(log);	
	report.flush();
	// report.close();
	obj.close();
	}
}
