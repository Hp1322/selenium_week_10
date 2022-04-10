package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest1 {
    public static void main(String[] args) {
        String basUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //get url
        driver.get(basUrl);
        //maximize
        driver.manage().window().maximize();
        //implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title
        String t = driver.getTitle();
        System.out.println(t);
        //get current url
        String c = driver.getCurrentUrl();
        System.out.println("Current URL = "+c);
        //get page source
        String pg = driver.getPageSource();
        System.out.println("Page source"+pg);
        //find emailfield
        WebElement mail = driver.findElement(By.id("user[email]"));
        mail.sendKeys("hanumandada@gmail.com");
        //find password field
        WebElement pass = driver.findElement(By.id("user[password]"));
        pass.sendKeys("123445515@pavan");

        //closing driver
        driver.close();

    }
}
