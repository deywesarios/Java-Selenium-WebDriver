package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createSession() {
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        navegador.manage().window().maximize();

        navegador.get("http://automationpractice.com");

        return navegador;
    }
}
