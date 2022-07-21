import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test1 extends BaseDriver{

    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        wait(2);

        WebElement city = driver.findElement(By.id("a1"));
      //  WebElement country = driver.findElement(By.cssSelector("div[id='questionDiv']>:nth-child(2)"));
        WebElement country = driver.findElement(By.cssSelector("div[id='q1']+div"));

        wait(2);

        Actions action = new Actions(driver);
        action.dragAndDrop(city,country).perform();
        wait(2);
        





        waitAndClose();
    }

}
