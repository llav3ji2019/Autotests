import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void loginTest(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ok.ru");
        User user = new User("****","*","Павел Емельянов");
        LoginPage loginPage = new LoginPage(driver, user);
        Assert.assertEquals(user.getFullname(), loginPage.getMainPage().checkFullName());
    }
}
