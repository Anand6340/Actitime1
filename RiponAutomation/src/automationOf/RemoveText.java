package automationOf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opensourcebilling.org/en/users/password/new");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
