package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginPage clicarSignIn() {
        navegador.findElement(By.className("login")).click();

        return this;
    }

    public LoginPage digitarEmail(String email) {
        navegador.findElement(By.id("email_create")).sendKeys(email);

        return this;
    }

    public CreateAnAccountPage clicarCreateAnAccount() {
        navegador.findElement(By.id("SubmitCreate")).click();

        return new CreateAnAccountPage(navegador);
    }

    public CreateAnAccountPage formularioEmail(String email) {
        digitarEmail(email);
        clicarCreateAnAccount();

        return clicarCreateAnAccount();
    }
}
