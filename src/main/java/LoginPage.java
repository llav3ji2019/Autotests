import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private WebDriver driver;
    private User user;

    LoginPage(WebDriver driver,User user){
        this.driver = driver;
        this.user = user;
    };

   MainPage getMainPage() {
       WebElement login = driver.findElement(By.xpath("//input[@id='field_email']"));
       WebElement password = driver.findElement(By.xpath("//input[@id='field_password']"));
       login.sendKeys(user.getLogin());
       password.sendKeys(user.getPassword());
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       return new MainPage(driver);
   }
}
