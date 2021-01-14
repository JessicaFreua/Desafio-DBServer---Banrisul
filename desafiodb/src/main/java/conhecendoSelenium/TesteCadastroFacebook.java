package conhecendoSelenium;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteCadastroFacebook {

	private static CadastroFacebookPage facebook;
	private static WebDriver driver;
	
	@BeforeClass
	public static void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		facebook = new CadastroFacebookPage(driver);
	}
	
	@Test
	public void deveLogarComSucesso() {
		facebook.logarComo("seu ususario", "sua senha");
	}
	
	@Test
	public void naoDeveLogarSemSenha() {
		facebook.logarComo("seu usuario.com", "");
	}
	
	@Test
	public void naoDeveLogarComSenhaErrada() {
		facebook.logarComo("seu usuario", "sua senha errada");
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
}
