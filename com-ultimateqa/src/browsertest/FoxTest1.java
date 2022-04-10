package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FoxTest1 {
    public static void main(String[] args) {
        String urlBase = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver heavyDriver = new FirefoxDriver();
        //getting url
        heavyDriver.get(urlBase);
        //implicit time for driver
        heavyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title page
        String pag = heavyDriver.getTitle();
        System.out.println(pag);
        //get current url
        String cur = heavyDriver.getCurrentUrl();
        System.out.println("Current title = "+cur);
        //get page source
        String sor = heavyDriver.getPageSource();
        System.out.println("Page source = "+sor);
        //find email id field
        WebElement mail = heavyDriver.findElement(By.id("user[email]"));
        mail.sendKeys("ramlakhan@mail.com");

        //find password field
        WebElement passd = heavyDriver.findElement(By.name("user[password]"));
        passd.sendKeys("haha121221");
        //close driver
        heavyDriver.close();
    }
}
