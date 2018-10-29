
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mercury1 {
	WebDriver driver= new ChromeDriver();
	@Test
	public void start() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	}
	

		//URL
		
	 public void Test() throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		
		
		//Title
		String actualtitle=driver.getTitle();
		System.out.println("The title of the page is:"+actualtitle);

		
		
		//Register
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		// First Name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aish");
		
		//Last name
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kulkarni");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Phone#
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9886261455");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		
		//Email
		driver.findElement(By.xpath(".//*[@id='userName']")).sendKeys("9886261455");
		
		//Scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		
		//Address
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("2cross  ");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Basveshwar nagar");
		
		//City
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Gulbarga");
		
		//State
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
		
		//Postal code
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("98000");	
		
		//Country
			
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dropdown.selectByIndex(4);
		
		//Name
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Aish");	
		
		//Password	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("confirm");	
		
		//Confirm password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("confirm");	
		
		//Submit
		driver.findElement(By.xpath("//input[@type='image']")).click();	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		

		
		//Click on Flights
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")).click(); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// One way click 
		driver.findElement(By.xpath("//input[@value='oneway']")).sendKeys("one way");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Passenger drop down by index element
		
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		dropdown1.selectByIndex(1);
		 //Departing from
		Select dropdown11 = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		dropdown11.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Drop down
		
		 driver.findElement(By.xpath("//select[@name='fromMonth']")).sendKeys("September");
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]")).sendKeys("9");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
		 //Arriving in drop down
		Select dropdown111 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		dropdown111.selectByIndex(2);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
		//Return drop down
		Select dropdown1111 = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		dropdown1111.selectByIndex(4);
		Select dropdown11111 = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		dropdown11111.selectByIndex(6);
		 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
		 //Service class
		 driver.findElement(By.xpath("//input[@value='Business']")).click();  
		 driver.findElement(By.xpath("//select[@name='airline']")).click();
		 driver.findElement(By.xpath("")).sendKeys("Pangea Airlines"); 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Click
	     driver.findElement(By.xpath("//input[@name='findFlights']" )).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 	
		//Click
		 driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']" )).click(); 
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 		
		 //Click
		 driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click(); 
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//Click to Continue
			driver.findElement(By.xpath("//input[@name='reserveFlights']")).click(); 
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


		// Passenger first name
	    driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Priya");
			
		//Passenger last name
		 driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Patil");
			
		 //Drop Down
		 Select dropdown111111 = new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
			dropdown111111.selectByIndex(3);
		 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		 // Credit Card
		driver.findElement(By.xpath("//select[@name='creditCard']")).click();
			
		//Drop Down
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[1]/select/option[2]")).sendKeys("MasterCard");
		//Number
		 driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("1234567891234567");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
			 
		//Expiration drop down by index value

		Select dropdown1111111 = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")));
		dropdown1111111.selectByIndex(1);
		Select dropdown11111111 = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")));
		dropdown11111111.selectByIndex(2);
		
		 //First
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Aish");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Middle
		driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("Raj");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Last name
		 driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("kulkarni");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 //Click Ticket less travel
		driver.findElement(By.xpath("//tbody//tr[8]//td[2]//input[1]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 
		 //Address
		 driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("Rajajinagar");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 //Click 
		 driver.findElement(By.xpath("//input[@name='billAddress2']")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Delivery address
	    driver.findElement(By.xpath("//input[@name='delAddress1']")).sendKeys("Jaynagar");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Secure purchase
	   driver.findElement(By.xpath("//input[@type='image']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  
		//Log out
		driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File file=ts.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(file, new File("D:\\screenb.jpeg"));
		 System.out.println("Saved the screenshot");
		
		driver.close();
		}

	
	}
		
