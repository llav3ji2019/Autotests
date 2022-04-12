package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private static final String FULL_NAME_ELEMENT = "//div[@class='tico ellip']";

    public MainPage(WebDriver driver){
        super(driver);
    }

    public String checkFullName(){
        return driver.findElement(By.xpath(FULL_NAME_ELEMENT)).getText();
    }


}
