
package Company;

import org.testng.annotations.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class StatusCodes extends SuiteConnection {
    HttpURLConnection con;
    private static int properResponse = 200;
    private int code;
    private static String url = "http://the-internet.herokuapp.com/";

    /**
     * click on Status codes link Connect with HttpConnection to get the backend code response
     */
    @BeforeMethod
    public void clickOnStatusCodes() {
        driver.findElement(selectors.statusCodesLink).click();
        try {
            con = (HttpURLConnection) new URL(url).openConnection();
            con.setRequestMethod("HEAD");
            code = con.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Click on 200 link verified the backend response to 200
     */
    @Test
    public void checkStatusCode200() {
        driver.findElement(selectors.statusCode200Click).click();
        check.assertStatusCodes(code, properResponse, "Status code misMatch");
    }

    /**
     * Click on 301 link verified the backend response to 200
     */
    @Test
    public void checkStatusCode301() {
        driver.findElement(selectors.statusCode301Click).click();
        check.assertStatusCodes(code, properResponse, "Status code misMatch");
    }

    /**
     * Click on 404 link verified the backend response to 200
     */
    @Test
    public void checkStatusCode404() {
        driver.findElement(selectors.statusCode404Click).click();
        check.assertStatusCodes(code, properResponse, "Status code misMatch");
    }

    /**
     * Click on 500 link verified the backend response to 200
     */
    @Test
    public void checkStatusCode500() {
        driver.findElement(selectors.statusCode500Click).click();
        check.assertStatusCodes(code, properResponse, "Status code misMatch");
    }

    /**
     * after execution test get back to Status codes link
     */
    @AfterMethod
    public void back() {
        driver.navigate().back();
        driver.navigate().back();
    }
}
