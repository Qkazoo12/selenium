package tests;

import core.StartSelenium;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Wojtek on 15.08.2016.
 */
public class Test1 extends StartSelenium {

    @Test
    public void search(){
        pause(5000);
        driver.findElement(By.xpath("//form//div//input[@class='searchInput']")).sendKeys("Whisky");
        driver.findElement(By.cssSelector("input[value=Szukaj]")).click();
        pause(2000);
    }
}
