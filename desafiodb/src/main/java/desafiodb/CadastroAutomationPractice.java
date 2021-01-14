package desafiodb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastroAutomationPractice {

	WebDriver driver;

	public CadastroAutomationPractice(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroAutomationPractice preencheEmailInicial(String email) {
		WebElement caixaEmail = driver.findElement(By.id("email_create"));
		caixaEmail.sendKeys("jessicafreua@teste2.com");
		caixaEmail.submit();
		return this;
	}

	public CadastroAutomationPractice preencheNome(String nome) {
		driver.findElement(By.id("customer_firstname")).sendKeys(nome);
		return this;
	}

	public CadastroAutomationPractice preencheSobrenome(String sobrenome) {
		driver.findElement(By.id("customer_lastname")).sendKeys(sobrenome);
		return this;
	}

	public CadastroAutomationPractice preencheSenha(String senha) {
		driver.findElement(By.id("passwd")).sendKeys(senha);
		return this;
	}

	public CadastroAutomationPractice preencheDia(String dia) {
		WebElement comboDia = driver.findElement(By.id("days"));
		Select select = new Select(comboDia);
		select.selectByVisibleText("6");
		return this;
	}

	public CadastroAutomationPractice preencheMes(String mes) {
		WebElement comboMes = driver.findElement(By.id("months"));
		Select select = new Select(comboMes);
		select.selectByVisibleText("August");
		return this;
	}

	public CadastroAutomationPractice preencheAno(String ano) {
		WebElement comboAno = driver.findElement(By.id("years"));
		Select select = new Select(comboAno);
		select.selectByVisibleText("1991");
		return this;
	}

	public CadastroAutomationPractice preenchePrimeiroNomeEndereco(String primeiroNomeEndereco) {
		driver.findElement(By.id("firstname")).sendKeys(primeiroNomeEndereco);
		return this;
	}

	public CadastroAutomationPractice preencheSegundoNomeEndereco(String segundoNomeEndereco) {
		driver.findElement(By.id("lastname")).sendKeys(segundoNomeEndereco);
		return this;
	}

	public CadastroAutomationPractice preencheEndereco(String endereco) {
		driver.findElement(By.id("address1")).sendKeys(endereco);
		return this;
	}

	public CadastroAutomationPractice preencheCidade(String cidade) {
		driver.findElement(By.id("city")).sendKeys(cidade);
		return this;
	}

	public CadastroAutomationPractice preencheEstado(String estado) {
		WebElement comboEstado = driver.findElement(By.id("id_state"));
		Select select = new Select(comboEstado);
		select.selectByVisibleText("Alabama");
		return this;
	}

	public CadastroAutomationPractice preencheCep(String cep) {
		driver.findElement(By.id("postcode")).sendKeys(cep);
		return this;
	}

	public CadastroAutomationPractice preencheCelular(String celular) {
		driver.findElement(By.id("phone_mobile")).sendKeys(celular);
		return this;
	}

	public CadastroAutomationPractice preencheReferenciaEnderecoEfinalizaCadastro(String referencia) {
		driver.findElement(By.id("address_alias")).sendKeys(referencia);
		driver.findElement(By.id("submitAccount")).click();
		return this;
	}

}
