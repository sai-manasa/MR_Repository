package LiveProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginStockAcooPropEx {
	
	WebDriver driver;
	Properties p;
	FileInputStream fi;
	WebDriverWait wait;

	@BeforeTest
	public void setUP() throws Throwable
	{
		p=new Properties();
		fi=new FileInputStream("C:\\Users\\surya\\git\\MR_Repository\\Tricky\\src\\elements.properties");
		p.load(fi);
		/*
		Set<String> pnames=p.stringPropertyNames();
		
		System.out.println("toatl properties"+pnames.size());
		System.out.println(pnames);
		
		Iterator iterator=pnames.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		*/
		
		System.out.println(p.getProperty("browser"));
		if(p.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(p.getProperty("url"));
			
		}
		else if(p.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(p.getProperty("url"));
			
			
		}
		
		else
		{
			Reporter.log("Browser value not matching",true);
		}
		
	}
	
	
	@Test
	public void loginSA()
	{
		WebElement breset=driver.findElement(By.xpath(p.getProperty("reset")));
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(breset));
		breset.click();
		
		
		//find element uname wait until it is active and then enter uname
		
		WebElement buname=driver.findElement(By.xpath(p.getProperty("username")));
		wait.until(ExpectedConditions.visibilityOf(buname));
		buname.sendKeys("admin");
		
		
		WebElement bpwd=driver.findElement(By.xpath(p.getProperty("password")));
		wait.until(ExpectedConditions.visibilityOf(bpwd));
		bpwd.sendKeys("master");
		
		
		WebElement blogin=driver.findElement(By.xpath(p.getProperty("login")));
		wait.until(ExpectedConditions.elementToBeClickable(blogin));
		blogin.click();
		
		String expected="http://projects.qedgetech.com/webapp/dashboard.php";
		String actual=driver.getCurrentUrl();
		
		if(expected.equalsIgnoreCase(actual))
		{
			wait.until(ExpectedConditions.urlContains(expected));
			Reporter.log("login successful "+expected+" "+actual,true);
			
		}
		else
		{
			Reporter.log("login fail"+expected+" "+actual);
		}
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
