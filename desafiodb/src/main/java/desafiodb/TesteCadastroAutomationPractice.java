package desafiodb;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCadastroAutomationPractice {

	private static CadastroAutomationPractice practice;
	private static WebDriver driver;

	@BeforeClass
	public static void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		practice = new CadastroAutomationPractice(driver);
	}

	@Test
	public void deveAcessarCadastro() {
		practice.preencheEmailInicial("jessicafreua@teste2.com.br");

	}
	
	//Não consegui preencher o formulário de cadastro,
	//Pois fica procurando os campos tudo na mesma tela
	//Tentei usar o WebDriverWait, mas não consegui fazer funcionar.

}
