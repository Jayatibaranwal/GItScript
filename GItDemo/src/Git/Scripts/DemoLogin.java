package Git.Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoLogin {
	WebDriver driver;
	FileInputStream filein;
	FileOutputStream fileout;
	XSSFWorkbook wb;
	XSSFSheet sh;
	String d1, d2;
	String Username , password;
	String webmsg;
	String xlmsg;
	
	@Test()
  public void f() {
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(Username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
        webmsg= driver.findElement(By.linkText(Username)).getText();
        
	}
  @BeforeTest
  public void beforetest() throws InvalidFormatException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C://Jayati//chromedriver_win32//chromedriver.exe");
	 driver= new ChromeDriver();
  }
	 @BeforeMethod
	  public void beforeMethod() throws InvalidFormatException, IOException {	 
	 filein= new FileInputStream("C:\\Jayati\\Datafile.xlsx");
	 wb= new XSSFWorkbook(filein);
	 sh= wb.getSheetAt(0);
	 Username=sh.getRow(1).getCell(0).getStringCellValue();
	 password=sh.getRow(1).getCell(1).getStringCellValue();
	 xlmsg=sh.getRow(1).getCell(2).getStringCellValue();
	 System.out.println(sh.getLastRowNum());
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	  fileout= new FileOutputStream("C:\\Jayati\\Datafile.xlsx");
	  sh.getRow(1).createCell(3).setCellValue(webmsg);
	  if(webmsg.equals(xlmsg))
	  {
		  sh.getRow(1).createCell(4).setCellValue("Pass");
	  }
	  else {
		  sh.getRow(1).createCell(4).setCellValue("Fail");
		  }
	  
	  wb.write(fileout);
  }
	  @AfterTest
	  public void afterTest() throws IOException {  
  wb.close();
  driver.close();

  }}
