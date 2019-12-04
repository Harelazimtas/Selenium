package s1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtumationRegisterGmail {

	public static WebDriver driver;
	JavascriptExecutor jse;
	
	public  void invokeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver", ".\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void SerachElement(String url) {
		driver.findElement(By.id("identifierId")).sendKeys("seleniumharel@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.name("password")).sendKeys("55679771as");
		driver.findElement(By.className("CwaK9")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}

	public static void main(String[] args) {
		AtumationRegisterGmail check=new AtumationRegisterGmail();
		String url="https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession";
		check.invokeBrowser(url);
		check.SerachElement(url);
	}

}
