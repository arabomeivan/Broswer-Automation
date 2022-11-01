import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    public static void main(String[] args) {



        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Ivan\\3D Objects\\Downloads\\Compressed\\chromedriver_win32_2/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        String url = "https://lendsqr-fe-test-arabomeivan.vercel.app/";
        driver.get(url);



        driver.manage().window().setSize(new Dimension(1366, 768));

        driver.findElement(By.id("email")).sendKeys("arabomeivan@gmail.com");
        driver.findElement(By.id("password")).sendKeys("arabomeivan");

        driver.findElement(By.id("loginbtn")).click();

        driver.close();

    }
}