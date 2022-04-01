package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.CreateAnAccountPage;
import pages.LoginPage;
import pages.MyAccount;
import suport.DataUtils;
import suport.Web;

public class RegisterStep extends DataUtils {
    private WebDriver navegador;


    @Dado("que o usuário crie uma conta com seu e-mail")
    public void queOUsuárioCrieUmaContaComSeuEMailNameLastnameEmail() {
        navegador = Web.createSession();
        new LoginPage(navegador)
                .clicarSignIn()
                .formularioEmail(name,lastname,email);
    }

    @Quando("realizar um cadastro")
    public void realizarUmCadastro() {
        new CreateAnAccountPage(navegador)
                .formularioCreateAccount(sexo,name,lastname,password,address,city,state,zipcode,phone,alias);
    }

    @Entao("deve ser redirecionado para a página My Account")
    public void deveSerRedirecionadoParaAPágina() {
        new MyAccount(navegador)
                .myAccount();
        navegador.quit();
    }

}
