package desafiodb;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteDbBanrisul {
	WebDriver driver;
	WebDriver webDriver;

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com");
		driver.manage().window().maximize();

	}

	@Test
	public void adicionaProdutoNoCarrinho() throws InterruptedException {
		// String original = driver.getWindowHandle();
		driver.findElement(By.className("sf-with-ul")).click();
		// driver.findElement(By.className("product_img_link")).click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("color_2")).click();
		driver.findElement(By.linkText("Add to cart")).click();

		// driver.navigate().refresh();

		// driver.findElement(By.linkText("Proceed to checkout")).click();

		// Alert alerta = driver.switchTo().alert();
		// alerta.accept();

		// Aqui tentei tratar o pop up para prosseguir para o checkout,
		// mas n�o tive sucesso.

		// Set<String> todasJanelas = driver.getWindowHandles();

		// for(String janela: todasJanelas) {
		// if(!janela.equals(original)) {
		// driver.switchTo().window(janela);
		// }
		// janela = driver.getWindowHandle();
		// driver.findElement(By.linkText("Proceed to checkout")).click();
	}
	// driver.switchTo().window(original);

	// @Test
	// public void iniciaCadastro(){
	// driver.findElement(By.className("login")).click();
	// WebElement caixaEmail = driver.findElement(By.id("email_create"));
	// caixaEmail.sendKeys("jessicafreua@teste2.com");
	// caixaEmail.submit();
	// driver.findElement(By.id("postcode")).sendKeys("000");

	// List<WebElement> verificados = driver.findElements(By.name("id_gender"));

	// for(WebElement verifica: verificados) {
	// if(verifica.getAttribute("value").equals("2")) {
	// if(!verifica.isSelected()) {

	// verifica.click();
	// }
	// }

	// }
	// }
}
