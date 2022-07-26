import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HelloSelenium2Test {
    //This method will also help us to difficulties regarding the chrome versions
    //This method will run once before all the tests in our class
    @BeforeAll
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();

    }
//    @Test
//    public void smarterTest() throws InterruptedException{
//        // Instantiate the driver
//        //Navigation driver.get
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.quit();
//
//    }
//    @Test
//    public void smarterTest1() throws InterruptedException{
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        Thread.sleep(1000);
//        driver.quit();
//
//    }
    //Testing with proper steps
    @Test
    public void testWithSteps(){
        //First step set the location of the driver
        //Second step Start session (Opens browser)
        WebDriver driver = new ChromeDriver();
        //Third step Navigate
        driver.get("https://www.saucedemo.com/");//http://address-book-example.herokuapp.com/sign_in

        // Fourth step ensure browser in correct state when finding element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        // Fiftieth step Take an action
        signIn.click();
        //Sixth Step Quit the browser
        driver.quit();


    }

}
