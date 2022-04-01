import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.easetech.easytest.annotation.DataLoader;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\CadastroDeUsuario.feature",
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        monochrome = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)
@DataLoader(filePaths = "InformacoesDoUsuarioDataStep.csv")
public class Runner {
}
