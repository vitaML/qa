import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FuncTest {
    @Test
    public void testMethod() {
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("http://www.google.com");
        driver1.quit();
    }
}
