package conhecendoSelenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassosComSelenium {

WebDriver driver;
	
	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com.br");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void teste() {
		WebElement caixaPesquisa = driver.findElement(By.name("q"));
				
		caixaPesquisa.clear();
		
		caixaPesquisa.sendKeys("teste");
		
		caixaPesquisa.submit();
	}
	
	@Test
	public void verificaSeTituloEstaCorreto() {
		String titulo = driver.getTitle();
		//boolean tituloEstaCorreto = titulo.equals("Google");
		Assert.assertTrue(titulo.equals("Google"));
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
	
}
