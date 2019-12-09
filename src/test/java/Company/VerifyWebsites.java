
package Company;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class VerifyWebsites extends SuiteConnection {
    private static int startValue = 1;
    private static int endValue = 4;
    private List<String> website = new ArrayList<>();

    /**
     * click on Sortable data table link
     */
    @BeforeMethod
    public void clickOnSortableDataTables() {
        driver.findElement(selectors.sortableDataTablesLink).click();
    }

    /**
     * Create a website list to store all the websites present in UI add all of them Assert method
     * for verify websites
     */
    @Test
    public void verifyWebsites() {
        IntStream.rangeClosed(startValue, endValue)
                .forEach(i -> website.add(driver.findElement(selectors.websitesColumnData(i)).getText()));
        check.assertTrue(website, "Not Matched");
    }
}
