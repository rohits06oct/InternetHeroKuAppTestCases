
package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;

public class BrokenImages extends SuiteConnection {
    private static boolean imageLoaded;

    /**
     * Click on broken image link
     */
    @BeforeMethod
    public void clickOnBrokenImages() {
        driver.findElement(selectors.brokenImagesLink).click();
    }

    /**
     * get all the images object inside imagesElement By using for each loop we send imagesElement
     * object inside imgElement verify imageLoaded is true.
     */
    @Test
    public void brokenImages() {
        try {
            List<WebElement> imageElement = driver.findElements(By.tagName("img"));
            imageElement.stream().forEach(image -> methods.verifyImageActive(image));
        } catch (Exception e) {
            e.printStackTrace();
        }
        check.assertFalse(imageLoaded, "Image is not properly load");
    }
}
