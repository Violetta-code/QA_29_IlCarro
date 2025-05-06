package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginTest() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("solodka1998@mail.ru", "Atteloiv123!");
        app.getHelperUser().submitLogin();
        app.getHelperUser().pause(5);
        app.getHelperUser().buttonOk();
    }
}
