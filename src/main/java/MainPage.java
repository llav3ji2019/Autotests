import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    MainPage(WebDriver driver){
        this.driver = driver;
    };

    public String checkFullName(){
        return driver.findElement(By.xpath("//div[@class='tico ellip']")).getText();
    }


}
