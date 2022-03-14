package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CreateAnAccountPage extends BasePage{
    public CreateAnAccountPage(WebDriver navegador) {
        super(navegador);
    }

    public CreateAnAccountPage selecionarSexo(String sexo) {
        WebDriverWait wait = new WebDriverWait(navegador, 10);
        if(sexo.equals("Male")) {
            WebElement radio = navegador.findElement(By.id("uniform-id_gender1"));
            wait.until(ExpectedConditions.elementToBeClickable(radio));
            radio.click();
        } else {
            WebElement radio = navegador.findElement(By.id("uniform-id_gender2"));
            wait.until(ExpectedConditions.elementToBeClickable(radio));
            radio.click();
        }

        return this;
    }

    public CreateAnAccountPage costumerFirstname(String name) {
        navegador.findElement(By.id("customer_firstname")).sendKeys(name);

        return this;
    }

    public CreateAnAccountPage costumerLastname(String lastname) {
        navegador.findElement(By.id("customer_lastname")).sendKeys(lastname);

        return this;
    }

    public CreateAnAccountPage password(String password) {
        navegador.findElement(By.id("passwd")).sendKeys(password);

        return this;
    }

    public CreateAnAccountPage address(String address) {
        navegador.findElement(By.id("address1")).sendKeys(address);

        return this;
    }

    public CreateAnAccountPage city(String city) {
        navegador.findElement(By.id("city")).sendKeys(city);

        return this;
    }

    public CreateAnAccountPage selectState(String state) {
        WebDriverWait wait = new WebDriverWait(navegador, 10);
        WebElement selectElement = navegador.findElement(By.xpath("//select[@id=\"id_state\"]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id=\"id_state\"]")));
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText(state);

        return this;
    }

    public CreateAnAccountPage postalCode(String zipcode) {
        navegador.findElement(By.id("postcode")).sendKeys(zipcode);

        return this;
    }

    public CreateAnAccountPage phone(String phone) {
        navegador.findElement(By.id("phone_mobile")).sendKeys(phone);

        return this;
    }

    public CreateAnAccountPage alias(String alias) {
        navegador.findElement(By.id("alias")).sendKeys(alias);

        return this;
    }

    public MyAccount clicarRegister() {
        navegador.findElement(By.id("submitAccount")).click();

        return new MyAccount(navegador);
    }

    public MyAccount formularioCreateAccount
    (
            String sexo,
            String name,
            String lastname,
            String password,
            String address,
            String city,
            String state,
            String zipcode,
            String phone,
            String alias
    )  {
        selecionarSexo(sexo);
        costumerFirstname(name);
        costumerLastname(lastname);
        password(password);
        address(address);
        city(city);
        selectState(state);
        postalCode(zipcode);
        phone(phone);
        alias(alias);
        clicarRegister();

        return clicarRegister();
    }
}
