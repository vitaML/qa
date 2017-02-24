import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FuncTest {
    @Test
    public void testMethod() {
        System.setProperty("webdriver.ie.driver", getClass().getResource("/ie.exe").getPath());
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.google.com");
        driver.quit();
    }
}
