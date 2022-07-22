import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Test3 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        List<WebElement> cities = driver.findElements(By.cssSelector("#allItems>li"));
        List<WebElement> countries = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']//ul"));

        Actions action = new Actions(driver);
        for (int i = 0; i < cities.size(); i++) {
            for (int j = 0; j < countries.size(); j++) {
                action.clickAndHold(cities.get(i)).perform();
                wait(1);
                action.release(countries.get(j)).perform();
                if (cities.get(i).getAttribute("class").equals("correctAnswer")) {
                    break;
                }
            }
        }

        waitAndClose();

    }


}
