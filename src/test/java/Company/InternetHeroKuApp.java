
package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternetHeroKuApp {
    WebDriver driver;

    /**
     * All Add Remove Elements CssSelectors
     */
    By add_DeleteLink = By.cssSelector("#content > ul > li:nth-child(2) > a");
    By clickOnAddButton = By.cssSelector("#content > div > button");
    By buttonList = By.className("added-manually");

    /**
     * All Broken Images CssSelectors
     */
    By brokenImagesLink = By.cssSelector("#content > ul > li:nth-child(4) > a");

    /**
     * All Status codes CssSelectors
     */
    By statusCodesLink = By.cssSelector("#content > ul > li:nth-child(41) > a");
    By statusCode200Click = By.cssSelector("#content > div > ul > li:nth-child(1) > a");
    By statusCode301Click = By.cssSelector("#content > div > ul > li:nth-child(2) > a");
    By statusCode404Click = By.cssSelector("#content > div > ul > li:nth-child(3) > a");
    By statusCode500Click = By.cssSelector("#content > div > ul > li:nth-child(4) > a");

    /**
     * All Sortable Data Tables CssSelectors
     */
    By sortableDataTablesLink = By.cssSelector("#content > ul > li:nth-child(40) > a");
    By clickOnLastNameColumn = By.cssSelector("#table1 > thead > tr > th:nth-child(1)");

    /**
     * get all the last name object inside ArrayList's
     */
    public By lastNameColumnData(int i) {
        By lastName = By.cssSelector("#table1 > tbody > tr:nth-child(" + i + ") > td:nth-child(1)");
        return lastName;
    }

    /**
     * get all the website object inside ArrayList's
     */
    public By websitesColumnData(int i) {
        By websites = By.cssSelector("#table1 > tbody > tr:nth-child(" + i + ") > td:nth-child(5)");
        return websites;
    }

    public InternetHeroKuApp(WebDriver driver) {
        this.driver = driver;
    }
}
