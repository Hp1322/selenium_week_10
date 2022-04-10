package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeT {
    public static void main(String[] args) {
        String urll = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //open URL
        driver.get(urll);
        //maximize
        driver.manage().window().maximize();
        //implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title
        String title = driver.getTitle();
        System.out.println("Title = "+title);

        //get current URL
        String cur = driver.getCurrentUrl();
        System.out.println("Current URL = "+cur);

        //get page source
        String pa = driver.getPageSource();
        System.out.println("Page source = "+pa);

        //find email field element
        WebElement mail = driver.findElement(By.id("username"));
        mail.sendKeys("aujbau@mail.com");

        //find pass field element
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("656@msnkn");

        //closing driver
        driver.close();
    }

}
