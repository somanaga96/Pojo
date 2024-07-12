package runner;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Junit {
    @Test
    public void testFindMax() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\soman\\Workbench\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

        List<WebElement> elements = driver.findElements(By.xpath("//table[contains(@id,\"cus\")]//tr"));

        List<WebElement> countires = driver.findElements(By.xpath("//table[contains(@id,'cus')]//tr/td[2]"));
        int i;
        for (i = 0; i < countires.size(); i++) {
            WebElement country = countires.get(i);
            String countryName = country.getText();
            if (countryName.equalsIgnoreCase("India")) {
                driver.findElement(By.xpath("//table[contains(@id,'cus')]//tr[" + i + "]//td[5]")).click();
                break;
            }
        }
        System.out.println("I:" + i);
        driver.quit();

    }
}
