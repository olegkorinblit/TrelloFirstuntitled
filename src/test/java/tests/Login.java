package tests;


import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {


    @Test


    public void positiveLogineTest(){
        app.getSessionHelper().openLoginForm();
        app.getSessionHelper().fillLoginForm(new User().withEmail("maxmayzel@gmail.com").withPassword("Rfrnec7_*"));
        app.getSessionHelper().submitLogin();
        Assert.assertTrue(app.getSessionHelper().
                isElementPresent(By.cssSelector(".DweEFaF5owOe02.V_PnoJ2AynVwLp.G6CmOLx93OUZez")));

    }

}

