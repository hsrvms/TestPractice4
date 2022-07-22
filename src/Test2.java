import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class Test2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> students = driver.findElements(By.xpath("//ul[@id='allItems']/li"));
        List<WebElement> teams = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']//ul"));

        Actions action = new Actions(driver);

        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < teams.size(); j++) {
                action.clickAndHold(students.get(i)).perform();
                Thread.sleep(300);
                action.release(teams.get(j)).perform();
            }
        }



        waitAndClose();
    }

}
