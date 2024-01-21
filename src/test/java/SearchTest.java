import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class SearchTest {

    @Test
    void flightappSearchbarTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://flights-app.pages.dev/");
        driver.findElement(By.id("headlessui-combobox-input-:Rq9lla:")).click();
        driver.findElement(By.id("headlessui-combobox-input-:Rq9lla:")).sendKeys("Istanbul");
        driver.findElement(By.xpath("//div[@class='flex']")).click();

        driver.findElement(By.id("headlessui-combobox-input-:Rqhlla:")).click();
        driver.findElement(By.id("headlessui-combobox-input-:Rqhlla:")).sendKeys("Istanbul");
        driver.findElement(By.xpath("//div[@class='flex']")).click();
    }
   @Test
    void flightappSearchbarTest2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://flights-app.pages.dev/");
        driver.findElement(By.id("headlessui-combobox-input-:Rq9lla:")).click();
        driver.findElement(By.id("headlessui-combobox-input-:Rq9lla:")).sendKeys("Istanbul");
        driver.findElement(By.xpath("//div[@class='flex']")).click();

        driver.findElement(By.id("headlessui-combobox-input-:Rqhlla:")).click();
        driver.findElement(By.id("headlessui-combobox-input-:Rqhlla:")).sendKeys("Los Angeles");
        driver.findElement(By.xpath("//div[@class='flex']")).click();

   }
   }



