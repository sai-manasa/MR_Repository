package LiveProject;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
     
     
     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().deleteAllCookies();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.get("https://www.gmail.com");
     
     driver.findElement(By.linkText("Help")).click();
     
     Thread.sleep(5000);
     driver.findElement(By.linkText("Privacy")).click();
     Thread.sleep(5000);
     driver.findElement(By.linkText("Terms")).click();
     Thread.sleep(5000);
     
    /* ArrayList<String> allwins=new ArrayList<String>(driver.getWindowHandles()); 
     System.out.println(allwins);
     
     System.out.println(allwins.size());
     
     for(int i=0;i<allwins.size();i++)
     {
    	 System.out.println(allwins.get(i));
    	 
     }*/
     
  
     Set<String> allWindowIds=driver.getWindowHandles();
     System.out.println(allWindowIds);
     
     Object[] objWindows=allWindowIds.toArray();
     String w1=objWindows[0].toString();
     String w2=objWindows[1].toString();
     String w3=objWindows[2].toString();
     String w4=objWindows[3].toString();
     System.out.println(w1+" "+w2+" "+w3+" "+w4);
     
     System.out.println(driver.getTitle());
     
     
     driver.switchTo().window(w1);//
     Thread.sleep(3000);
     System.out.println("w1 "+driver.getTitle());
     driver.close();
     
     driver.switchTo().window(w2);//Terms
     Thread.sleep(3000);
     System.out.println("w2 "+driver.getTitle());
     driver.close();
     
     
     driver.switchTo().window(w3);//privacy
     Thread.sleep(3000);
     System.out.println("w3 "+driver.getTitle());
     driver.close();
     
     driver.switchTo().window(w4);//Help
     Thread.sleep(3000);
     System.out.println("w4 "+driver.getTitle());
     driver.close();
     
    
     
     
     //   (//a[text()='Technologies'])[1]
	}

}
