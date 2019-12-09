
package CallValues;

import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class Assert extends org.testng.Assert {
    private static String websiteRegex = "http://[w]*.[a-z]*.com";

    /**
     * Assert method for check Add Delete button
     */
    public static void assertEquals(List<WebElement> buttonElement, int expButton, String errorMessage) {
        if (buttonElement.size() != expButton) {
            throw new AssertionError(
                    errorMessage + "--> \nExpected button is: " + expButton + " \nActual button is: " + buttonElement.size());
        } else {
            System.out.println("Expected button is: " + expButton + " \nActual button is: " + buttonElement.size());
        }
    }

    /**
     * Assert method for check Images are loaded properly or not
     */
    public static void assertFalse(boolean expectedImage, String errorMessage) {
        if (expectedImage != false) {
            throw new AssertionError(errorMessage + " \n" + expectedImage);
        } else {
            System.out.println("All the images loaded properly");
        }
    }

    /**
     * Assert method for check status code of link
     */
    public static void assertStatusCodes(int actualCode, int expectedCode, String errorMessage) {
        if (expectedCode != actualCode) {
            throw new AssertionError(errorMessage + "--> \nExpected data is:" + expectedCode + " \nActual data is:" + actualCode);
        } else {
            System.out.println("All links open properly");
        }
    }

    /**
     * Assert method for verify websites for each loop verify all the websites by regex
     */
    public static void assertTrue(List<String> actualWebsite, String errorMessage) {
        for (String verify : actualWebsite) {
            if (!verify.matches(websiteRegex)) {
                throw new AssertionError(
                        errorMessage + "--> \nExpected data is:" + websiteRegex + " \nActual data is: " + verify);
            } else {
                System.out.println("This Website is " + verify + " matches with " + websiteRegex);
            }
        }
    }

    /**
     * Assert method for verify lastName's both of the lists name is equal or not
     */
    public static void assertElementListEquals(List<String> actualLastName, List<String> expectedLastName, String errorMessage) {
        Iterator actIt = actualLastName.iterator();
        Iterator expIt = expectedLastName.iterator();
        while (actIt.hasNext() && expIt.hasNext()) {
            Object actualName = actIt.next();
            Object expectedName = expIt.next();
            if (!actualName.equals(expectedName)) {
                throw new AssertionError(
                        errorMessage + "-->\n" + "Expected name is: " + expectedName + " \nActual name is: " + actualName);
            } else {
                System.out.println("Expected name -> " + expectedName + " is equal to Actual name -> " + actualName);
            }
        }
    }
}
