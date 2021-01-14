package desafiodb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionaProdutoNoCarrinho {

	WebDriver driver;

	public AdicionaProdutoNoCarrinho(WebDriver driver) {
		this.driver = driver;
	}
	
	public AdicionaProdutoNoCarrinho selecionaProduto(WebDriver driver) {
		driver.findElement(By.className("sf-with-ul")).click();
		driver.findElement(By.id("color_2")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		return this;
	}
}
