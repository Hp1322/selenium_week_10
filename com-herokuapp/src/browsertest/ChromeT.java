package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeT {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Get URL
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize
        //implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get title
        String tl = driver.getTitle();
        System.out.println("Title = "+tl);

        //Get current URL
        String cur = driver.getCurrentUrl();
        System.out.println("Current URL = "+cur);

        //Get page source
        String sour = driver.getPageSource();
        System.out.println("Page Source = "+sour);

        //Entering email field
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("Ramsita@mail.com");

        //Entering pass field
        WebElement pas = driver.findElement(By.name("password"));
        pas.sendKeys("1234656789");

        //Closing browser
        driver.close();

    }
}
