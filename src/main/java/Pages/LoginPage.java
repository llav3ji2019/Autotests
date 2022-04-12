package Pages;

import Utils.User;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final User user;
    private static final String PASSWORD_ELEMENT = "//input[@id='field_password']";
    private static final String LOGIN_ELEMENT = "//input[@id='field_email']";
    private static final String BUTTON_ELEMENT = "//input[@type='submit']";

    public LoginPage(WebDriver driver, User user){
       super(driver);
       this.user = user;
    }

   public MainPage getMainPage() {
       WebElement login = driver.findElement(By.xpath(LOGIN_ELEMENT));
       WebElement password = driver.findElement(By.xpath(PASSWORD_ELEMENT));
       login.sendKeys(user.getLogin());
       password.sendKeys(user.getPassword());
       driver.findElement(By.xpath(BUTTON_ELEMENT)).click();
       return new MainPage(driver);
   }
}
