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

    public LoginPage digitarEmail(String name, String lastname, String email) {
        navegador.findElement(By.id("email_create")).sendKeys(name+lastname+email);

        return this;
    }

    public CreateAnAccountPage clicarCreateAnAccount() {
        navegador.findElement(By.id("SubmitCreate")).click();

        return new CreateAnAccountPage(navegador);
    }

    public CreateAnAccountPage formularioEmail(String name, String lastname, String email) {
        digitarEmail(name, lastname, email);
        clicarCreateAnAccount();

        return clicarCreateAnAccount();
    }
}
