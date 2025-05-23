package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperBase {

    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text){

        WebElement element= wd.findElement(locator);
        element.click();
        element.clear();
        if(text!=null)
            element.sendKeys(text);

    }

    public void click(By locator){
        WebElement element= wd.findElement(locator);
        element.click();
    }
    public void pause(int time) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isElrmentPresent(By locator){
        List<WebElement> list=wd.findElements(locator);
        return  !list.isEmpty();
    }

    public boolean logPassIncorrect(By locator) {
        List<WebElement> list2=wd.findElements(locator);
        return  !list2.isEmpty();
    }
}
