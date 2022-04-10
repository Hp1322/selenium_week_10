package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest1 {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver rocket = new EdgeDriver();
        //get url
        rocket.get(baseUrl);
        //maximize
        rocket.manage().window().maximize();
        //implicit time for driver
        rocket.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        rocket.get(baseUrl);
        //title
        System.out.println("Title = "+rocket.getTitle());
        //current URL
        System.out.println("Current URL ="+rocket.getCurrentUrl());
        //Page source
        System.out.println("Page source = "+rocket.getPageSource());
        //email field element
        WebElement mail = rocket.findElement(By.id("user[email]"));
        mail.sendKeys("modihai@gmail.com");
        //password field element
        WebElement pass = rocket.findElement(By.name("user[password]"));
        pass.sendKeys("Tomunkinhai@wahwah");


    }
}
