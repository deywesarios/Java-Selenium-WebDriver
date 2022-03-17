package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class MyAccount extends BasePage{
    public MyAccount(WebDriver navegador) {
        super(navegador);
    }

    public MyAccount myAccount() {
        String title = navegador.getTitle();
        assertEquals("My account - My Store", title);
        navegador.findElement(By.linkText("My account"));

        return this;
    }
}

