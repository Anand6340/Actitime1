package automationOf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCurrentUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		//navigating to the website
		driver.get("https://www.google.com/");
		//To get the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
