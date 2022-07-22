import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class Test1 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> cities = driver.findElements(By.cssSelector("div[id='answerDiv']>div[class='dragDropSmallBox']"));
        List<WebElement> countries = driver.findElements(By.cssSelector("div[id='questionDiv']>div[class='destinationBox']"));
        wait(2);

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

        // action.moveToElement(city).clickAndHold().perform();
        // wait(2);
        // action.release(country).perform();
        // wait(2);


        waitAndClose();
    }

}
