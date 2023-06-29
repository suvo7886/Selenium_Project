package selenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class facebook_signup {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805904%7Cb%7Cgooglefacebook%7C&placement=&creative=550525805904&keyword=googlefacebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221672%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-10747043725%26loc_physical_ms%3D1007828%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwtO-kBhDIARIsAL6Lorf5rMV_k6x532_J5-V4ifOJXvg8nVjQOp3We-7HbJAXxDVKr0hBUs8aAo9vEALw_wcB");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        WebElement fnameInput = driver.findElement(By.name("firstname"));
	        fnameInput.sendKeys("Susmita");
	        Thread.sleep(2000);
	        WebElement lnameInput = driver.findElement(By.name("lastname"));
	        lnameInput.sendKeys("Sarkar");
	        Thread.sleep(2000);
	        WebElement emailInput = driver.findElement(By.name("reg_email__"));
	        emailInput.sendKeys("susmita@gmail.com");
	        Thread.sleep(2000);
	        WebElement reemailInput = driver.findElement(By.name("reg_email_confirmation__"));
	        reemailInput.sendKeys("susmita@gmail.com");
	        Thread.sleep(2000);
	        WebElement passwordInput = driver.findElement(By.name("reg_passwd__"));
	        passwordInput.sendKeys("123456++");
	        Thread.sleep(2000);
	        Select select = new Select(driver.findElement(By.name("birthday_year")));
	        select.selectByVisibleText("1990");
	        Thread.sleep(2000);
	        WebElement genderInput = driver.findElement(By.name("sex"));
	        if (!genderInput.isSelected()) {
	        	genderInput.click();
	        }
	        Thread.sleep(2000);
	        WebElement createAccount = driver.findElement(By.name("websubmit"));
	        createAccount.click();
	        Thread.sleep(2000);
	        System.out.println("Hurray! Your registration successfull. Please verify your email id to continue...");
	        Thread.sleep(3000);
	        driver.quit();
	    }
}
