package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void fillLoginForm(String email, String password){

        type(By.xpath("//input[@formcontrolname='email']"), email);
        type(By.cssSelector("[ng-reflect-name='password']"), password);
    }

    public void openLoginForm(){

        click(By.cssSelector("a[href='/login?url=%2Fsearch']"));
    }

    public void submitLogin(){
        click(By.xpath("//button[text()='Y’alla!']"));
    }

    public void buttonOk(){
       click(By.xpath("//*[@class='positive-button ng-star-inserted']"));
    }
}
