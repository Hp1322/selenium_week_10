package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxT {
    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver drive = new FirefoxDriver();
        //Get Url
        drive.get(url);
        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title
        String tile = drive.getTitle();
        System.out.println("Title = "+tile);

        //get current URL
        String cu = drive.getCurrentUrl();
        System.out.println("Current URL = "+cu);

        //get page source
        String pg = drive.getPageSource();
        System.out.println("Page source = "+pg);

        //find email field element
        WebElement ml = drive.findElement(By.name("username"));
        ml.sendKeys("yagy@gmail.com");

        //find pass field
        WebElement ps = drive.findElement(By.name("password"));
        ps.sendKeys("51652@msnjsn");

        //Close driver
        drive.close();
    }
}
