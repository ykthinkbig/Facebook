package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        //launch chromebrower
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //inout the URL
        driver.get("https://www.facebook.com/");
        //waiting for the page URL to fully load
        Thread.sleep(5000);
        //maximixe opened page
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //input username
        driver.findElement(By.id("email")).sendKeys("xxxxxxx");
        //input passeword
        driver.findElement(By.id("pass")).sendKeys("xxxxxxxxx");
        //click on the login button
        driver.findElement(By.id("loginbutton")).click(); }
    //run Test
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }


    }
