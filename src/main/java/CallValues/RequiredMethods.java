
package CallValues;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebElement;

public class RequiredMethods {
    private static boolean imageLoaded;

    /**
     * Get imgElement one by one verifying response code HttpStatus should be 200 if not, if any
     * image not load properly then imageLoaded is false
     */
    public static void verifyImageActive(WebElement imgElement) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(imgElement.getAttribute("src"));
            HttpResponse response = client.execute(request);
            if (response.getStatusLine().getStatusCode() != 200)
                imageLoaded = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
