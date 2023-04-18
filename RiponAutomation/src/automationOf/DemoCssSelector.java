package automationOf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\anand\\OneDrive\\Desktop\\Demo11.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='https://qspiders.com/']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[class='c2']")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
