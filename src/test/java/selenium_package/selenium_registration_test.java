package selenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_registration_test {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("http://localhost:8083/addressbook/");
		        driver.manage().window().maximize();
		        Thread.sleep(3000);
		        WebElement clickSignup = driver.findElement(By.className("v-button"));
		        clickSignup.click();
		        Thread.sleep(3000);
		        WebElement fnameInput = driver.findElement(By.xpath("//div[@class='v-slot']//div[@class='v-formlayout']//table[@class='v-formlayout-margin-top']//tr[@class='v-formlayout-row']//td[@class='v-formlayout-contentcell']//input[@id='gwt-uid-5']"));
		        fnameInput.sendKeys("demo");
		        Thread.sleep(2000);
		        WebElement lnameInput = driver.findElement(By.id("gwt-uid-55"));
		        lnameInput.sendKeys("user");
		        Thread.sleep(2000);
		        WebElement mobileInput = driver.findElement(By.id("gwt-uid-57"));
		        mobileInput.sendKeys("9876543210");
		        Thread.sleep(2000);
		        WebElement emailInput = driver.findElement(By.id("gwt-uid-59"));
		        emailInput.sendKeys("demo@gmail.com");
		        Thread.sleep(2000);
		        WebElement dobInput = driver.findElement(By.id("gwt-uid-61"));
		        dobInput.sendKeys("6/11/59,");
		        Thread.sleep(2000);
		        WebElement createAccount = driver.findElement(By.className("v-button-primary"));
		        createAccount.submit();
		        Thread.sleep(2000);
		        driver.quit();
		    }
		}