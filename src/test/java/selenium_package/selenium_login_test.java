	package selenium_package;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class selenium_login_test {
		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        driver.findElement(By.id("user-name")).sendKeys("demo");
	        Thread.sleep(3000);
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        Thread.sleep(3000);
	        driver.findElement(By.name("login-button")).click();
	        Thread.sleep(3000);
	        System.out.println("Hurray! You have succesfully login...");
	        Thread.sleep(3000);
	        driver.quit();
	        System.out.println("You have succesfully exit!");
	    }
}
