
package Company;

import org.testng.annotations.*;
import java.util.stream.IntStream;

public class AddDeleteElements extends SuiteConnection {
    private static int startValue = 1;
    private static int endValue = 10;

    /**
     * Click on the Add/Remove Elements link
     */
    @BeforeMethod
    public void clickOnAdd_RemoveLink() {
        driver.findElement(selectors.add_DeleteLink).click();
    }

    /**
     * Click on add button 10 times Verified all the 10 Button display or not
     */
    @Test
    public void addButton() {
        IntStream.rangeClosed(startValue, endValue).forEach(i -> driver.findElement(selectors.clickOnAddButton).click());
        check.assertEquals(driver.findElements(selectors.buttonList), endValue, "Both the buttons not match");
    }

    /**
     * Click on delete button and remove all of them
     */
    @AfterMethod
    public void clickOnAllDeleteButtons() {
        driver.navigate().refresh();
    }
}
