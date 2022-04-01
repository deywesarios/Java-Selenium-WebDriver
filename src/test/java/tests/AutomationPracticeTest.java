package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suport.Web;

// DESTE MODELO A MASSA DE DADOS ESTÁ FIXA SENDO NECESSÁRIA ALTERAÇÕES NO ARQUIVO .CSV

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesDoUsuarioData.csv")
public class AutomationPracticeTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createSession();
    }

    @Test
    public void testFazerCadastroDoUsuario(
            @Param(name = "email")String email,
            @Param(name = "sexo")String sexo,
            @Param(name = "name")String name,
            @Param(name = "lastname")String lastname,
            @Param(name = "password")String password,
            @Param(name = "address")String address,
            @Param(name = "city")String city,
            @Param(name = "state")String state,
            @Param(name = "zipcode")String zipcode,
            @Param(name = "phone")String phone,
            @Param(name = "alias")String alias
    ) {
        new LoginPage(navegador)
                .clicarSignIn()
                .formularioEmail(name,lastname,email)
                .formularioCreateAccount(sexo,name,lastname,password,address,city,state,zipcode,phone,alias)
                .myAccount();
    }

    @After
    public void tearDown() {
        navegador.quit();
    }
}
