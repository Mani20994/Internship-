
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class AutomationPractice1 {

   public static void main(String[] args) throws InterruptedException {
	           //Initiating the browser and URL
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//URL
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				
				//Register
				driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
				driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ra123@gmail.com");
				driver.findElement(By.xpath(".//*[@name='passwd']")).sendKeys("1qaz!QAZ");
				driver.findElement(By.xpath(".//*[@name='passwd']")).sendKeys(Keys.ENTER);
				
				//select women
				
				driver.findElement(By.xpath("#layered_category_9")).click();
				
				
				
				
   }
	}