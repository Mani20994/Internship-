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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryTours {
	WebDriver driver= new ChromeDriver();

		//URL
		@BeforeTest
	 public void Test() throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		
		
		//Title
		String actualtitle=driver.getTitle();
		System.out.println("The title of the page is:"+actualtitle);
}
		@Test(priority=0)
		public void Start()throws InterruptedException, IOException {
		
		//Register
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
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
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")).click();	
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select/option[232]")).click();
		
		//Name
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Aish");	
		
		//Password	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("confirm");	
		
		//Confirm password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("confirm");	
		
		//Submit
		driver.findElement(By.xpath("//input[@type='image']")).click();	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		@Test(priority = 1)

		public void Flights()throws InterruptedException, IOException {
		//Click on Flights
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")).click(); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// One way click 
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).sendKeys("one way");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Passenger drop down by index element
		
		Select dropdown = new Select(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")));
		dropdown.selectByIndex(1);
		 //Drop down 
		 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[1]/font/b")).click();
		 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")).sendKeys("Newyork");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Drop down
		 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select")).sendKeys("September");
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]")).sendKeys("9");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
		 //Drop down
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[6]/td[1]/font[1]/b[1]")).click();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/select[1]")).sendKeys("Paris");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
		//Return drop down
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/select[1]")).sendKeys("September");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/select[2]")).sendKeys("28");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
		 //Service class
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[10]/td[1]/font[1]/b[1]")).click();  
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[10]/td[2]/select[1]")).sendKeys("Pangea Airlines");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[14]/td[1]/input[1]")).click(); 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Click
	     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/input[1]" )).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 	
		//Click
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[5]/td[1]/input[1]" )).click(); 
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 		
		 //Click
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/p[1]/input[1]")).click(); 
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Passenger first name
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).sendKeys("Priya");
			
		//Passenger last name
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("Patil");
			
		 //Drop down
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[3]/select[1]")).sendKeys("Hindu");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		 // Passenger second name
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).sendKeys("Pooja");
			
		//Passenger last name
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("Patil");
			
		 //Drop down
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/font[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/font[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[2]/td[3]/select[1]")).sendKeys("Hindu");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		  //Number
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("1234567891234567");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
		//Expiration drop down
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td/table/tbody/tr[2]/td[3]/select[1]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td/table/tbody/tr[2]/td[3]/select[1]/option[4]")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td/table/tbody/tr[2]/td[3]/select[2]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td/table/tbody/tr[2]/td[3]/select[2]/option[4]")).click();

		 //First
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).sendKeys("Aish");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Middle
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("Raj");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Last name
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[2]/td[3]/input[1]")).sendKeys("kulkarni");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 //Click Ticket less travel
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 
		 //Address
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[10]/td[2]/input[1]")).sendKeys("Rajajinagar");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 //Click 
		 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Delivery address
	    driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input")).sendKeys("Jaynagar");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Secure purchase
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[24]/td[1]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  
		//Log out
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[7]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]/img[1]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File file=ts.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(file, new File("D:\\screenb.jpeg"));
		 System.out.println("Saved the screenshot");
		
		driver.close();
		}

	


		@AfterTest

		public void quit() {
		 
		 driver.quit();
	
		}
}