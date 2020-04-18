import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UsingElementsTest {
    private static WebDriver driver;

    @Test
    public void test01_clickAnElementFromAListWithAKnownIndex() {
        List<WebElement> buttonsList = driver.findElements(By.id("Button"));
        buttonsList.get(3).click();
    }

    @Test
    public void test02_iteratingAListOfElements(){
        // Create a list of all elements with the ID=Button
        List<WebElement> buttonsList = driver.findElements(By.id("Button"));
        // Iterating through the list
        for (WebElement currentButton : buttonsList) {
            // Finding a specific element with a specific text and clicking it
            if (currentButton.getText().equals("button1")) {
                currentButton.click();
            }
        }
    }
}
