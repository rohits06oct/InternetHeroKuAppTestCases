
package Company;

import CallValues.RequiredMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import CallValues.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class SuiteConnection {
    WebDriver driver;
    private final String url = "http://the-internet.herokuapp.com/";
    InternetHeroKuApp selectors;
    Assert check;
    RequiredMethods methods;

    /**
     * Driver Got connected with Chrome open the url Set the resolution of browser get all the
     * cssSelectors object inside "selectors"
     */
    @BeforeSuite
    public void connection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1680, 823));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        selectors = new InternetHeroKuApp(driver);
    }

    /**
     * Close the browser
     */
    @AfterSuite
    public void close() {
        driver.quit();
    }
}
