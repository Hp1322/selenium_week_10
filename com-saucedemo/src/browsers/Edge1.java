package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge1 {
    public static void main(String[] args) {
        String url1 = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver d = new EdgeDriver();
        //get url
        d.get(url1);
        //maximize window
        d.manage().window().maximize();
        //implicit time for driver
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title
        String t = d.getTitle();
        System.out.println("Title = "+t);
        //get current url
        String cur = d.getCurrentUrl();
        System.out.println("Current URL ="+cur);
        //get page source
        String pag = d.getPageSource();
        System.out.println("Page source = "+pag);
        //find email field element
        WebElement mail1 = d.findElement(By.id("user-name"));
        mail1.sendKeys("ramsiyaram@gmail.com");
        //find password field
        WebElement pas = d.findElement(By.name("password"));
        pas.sendKeys("ramsiyaram1231");

        //closing driver
        d.close();
        
    }

}
