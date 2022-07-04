package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		String url ="https://www.amazon.fr";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

	}

}
