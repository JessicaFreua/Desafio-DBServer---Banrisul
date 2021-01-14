package conhecendoSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroMagazine {
	
WebDriver driver;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.magazineluiza.com.br");
		driver.findElement(By.className("login-link")).click();
		
	}
	
	@Test
	public void cadastroDafitiComSucesso() throws InterruptedException {
		driver.findElement(By.name("login")).sendKeys("joaosilva@teste.com.br");
		driver.findElement(By.className("LoginBox-form-continue")).click();
	}
//N�o consegui seguir quando apareceu o por up
}