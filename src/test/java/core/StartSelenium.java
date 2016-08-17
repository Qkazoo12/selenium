package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Wojtek on 15.08.2016.
 */
public class StartSelenium {
    protected WebDriver driver;

    @BeforeMethod
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wojtek\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.teksty.wywrota.pl/");
    }

    @AfterMethod
    public void stop(){
        driver.quit();
    }

    public void pause(int seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
