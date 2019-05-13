package Git.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Jayati//chromedriver_win32//chromedriver.exe");

		WebDriver driver= new ChromeDriver();
	
driver.get("http://demowebshop.tricentis.com/login");
driver.findElement(By.id("Email")).sendKeys("anmol123@gmail.com");
driver.findElement(By.id("Password")).sendKeys("abcd@123");
Thread.sleep(5000);
driver.findElement(By.cssSelector("input[value='Log in']")).click();
driver.close();

}
}
