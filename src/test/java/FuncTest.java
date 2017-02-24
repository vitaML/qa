import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FuncTest {
    @Test
    public void testMethod() {
        System.setProperty("webdriver.chrome.driver", getClass().getResource("/chromedriver.exe").getPath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();
    }
}
