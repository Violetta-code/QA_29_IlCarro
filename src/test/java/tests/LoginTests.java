package tests;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if (app.getHelperUser().isLogged()){
            app.getHelperUser().logout();
        }
    }

    @Test
    public void loginTest() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("solodka1998@mail.ru", "Atteloiv123!");
        app.getHelperUser().submitLogin();
     // app.getHelperUser().pause(5);
        //dialog-container
        //Logged in success
        Assert.assertEquals(app.getHelperUser().getMessage(),"Logged in success");
        app.getHelperUser().buttonOk();
    }

    @Test
    public void loginTestWrongEmail() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("solodka1998mail.ru", "Atteloiv123!");
        app.getHelperUser().submitLogin();
        Assert.assertEquals(app.getHelperUser().getTitle(),"Login failed");
        app.getHelperUser().buttonOk();
    }

    @Test
    public void loginTestWrongPassword() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("solodka1998@mail.ru", "Attel123!");
        app.getHelperUser().submitLogin();

        app.getHelperUser().buttonOk();
    }

    @Test
    public void loginTestUnRegisterUser() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("sdfggs8@mail.ru", "Sfhjtc123!");
        app.getHelperUser().submitLogin();
       // app.getHelperUser().buttonOk();

        app.getHelperUser().buttonOk();
    }
}
