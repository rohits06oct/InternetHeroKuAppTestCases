
package Company;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SortableTableData extends SuiteConnection {
    private static int startValue = 1;
    private static int endValue = 4;
    private List<String> lastNameWithOutClick = new ArrayList<>();
    private List<String> lastNameWithClick = new ArrayList<>();

    /**
     * click on Sortable Data tables link
     */
    @BeforeMethod
    public void clickOnSortableDataTables() {
        driver.findElement(selectors.sortableDataTablesLink).click();
    }

    /**
     * get all the last name column data inside lastNameWithoutClick list after that click on last
     * name column to get the sortable data and store inside lastNameWithClick list and verify both
     * of them Assert both the lastNameWithClick and lastNameWithClick
     */
    @Test
    public void checkOnLastNameColumn() {
        IntStream.rangeClosed(startValue, endValue)
                .forEach(i -> lastNameWithOutClick.add(driver.findElement(selectors.lastNameColumnData(i)).getText()));
        driver.findElement(selectors.clickOnLastNameColumn).click();
        IntStream.rangeClosed(startValue, endValue)
                .forEach(i -> lastNameWithClick.add(driver.findElement(selectors.lastNameColumnData(i)).getText()));
        check.assertElementListEquals(lastNameWithClick, lastNameWithOutClick, "Both the names not match");
    }
}
