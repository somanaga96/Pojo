//package StepDefinations;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import lombok.SneakyThrows;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class MyStepdefs {
//    ChromeDriver driver = new ChromeDriver();
//
//    @Given("Browser is open")
//    public void browser_is_open() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\soman\\Workbench\\ChromeDriver\\chromedriver.exe");
////        WebDriver driver = new ChromeDriver();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.sendKeys("jhsj");
////        driver.navigate().to("https://www.privilege.com/home/quote/your-home");
//        driver.navigate().to("https://www.google.co.in/");
//        Thread.sleep(8000);
//        List<WebElement> el = driver.findElements(By.xpath("//*"));
//        int count = 0;
//        for (WebElement e : el) {
//            System.out.println(e.getTagName());
//
//            count++;
//
//        }
//        System.out.println(count);
////        if(driver.findElement(By.xpath("//*[@id=\"onetrust-policy-title\"]")).isDisplayed()){
//        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
////        }
//        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("BR11DP");
//        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/form/bp-postcode-search/div[1]/div/div[2]/button")).click();
//    }
//
//    @Given("Launch Google Browser")
//    public void launchGoogleBrowser() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\soman\\Workbench\\ChromeDriver\\chromedriver.exe");
//        driver.manage().window().maximize();
//        driver.navigate().to("https://www.google.co.in/");
//    }
//
//    @Given("Launch Bing Bowser")
//    public void launchBingBowser() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\soman\\Workbench\\ChromeDriver\\chromedriver.exe");
//        driver.manage().window().maximize();
//        driver.navigate().to("https://www.bing.com/");
//    }
//
//    @SneakyThrows
//    @When("Enter the {string} in browser")
//    public void enterTheInBrowser(String value) {
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys(value, Keys.ENTER);
//    }
//}
