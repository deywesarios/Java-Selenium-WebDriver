package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import suport.Web;

import java.util.concurrent.TimeUnit;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesDoUsuarioData.csv")
public class CadastroDeUsuarioStep {

    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createSession();
    }

    @Dado("que o usuário crie uma conta com seu e-mail")
    public void queOUsuárioCrieUmaContaComSeuEMail(
            @Param(name = "email")String email,
            @Param(name = "name")String name,
            @Param(name = "lastname")String lastname
    ) {
        new LoginPage(navegador)
                .clicarSignIn()
                .formularioEmail(name, lastname, email);

    }

    @Quando("realizar um cadastro")
    public void realizarUmCadastro() {

    }

    @Entao("deve ser redirecionado para a página {string}")
    public void deveSerRedirecionadoParaAPágina(String arg0) {

    }
}
