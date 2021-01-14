package desafiodb;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAdicionaProdutoNoCarrinho {

	private static AdicionaProdutoNoCarrinho product;
	private static WebDriver driver;
	
	@BeforeClass
	public static void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		product = new AdicionaProdutoNoCarrinho(driver);
	}
	
	@Test
	public void deveAdicionarProdutoNoCarrinho() {
		product.selecionaProduto(driver);
		

	}
		//N�o consegui clicar no bot�o para prosseguir para o checkout,
		//Tentei tratat o pop up, mas n�o tive sucesso.
		//Tentei os metodos driver.getWindowHandle();
						  //driver.switchTo().alert();
}
