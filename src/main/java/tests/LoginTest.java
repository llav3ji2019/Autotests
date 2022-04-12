package tests;

import Pages.LoginPage;
import Utils.User;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void loginTest(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ok.ru");
        User user = new User.UserBuilder()
                .setLogin("79313643643")
                .setFullName("Павел Емельянов")
                .setPassword("pavel2003")
                .build();
        LoginPage loginPage = new LoginPage(driver, user);
        Assert.assertEquals(user.getFullName(), loginPage.getMainPage().checkFullName());
    }
}
    