package Testes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Auxiliares.DSL;
import Auxiliares.ItemPage;
public class TesteContatoComAEmpresa {

	private WebDriver driver;
	private DSL dsl;
	private ItemPage page;

	@Before
	public void inicializa(){
		driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php");
		dsl = new DSL(driver);
		page = new ItemPage(driver);
	}
	
	@After
	public void finaliza(){
		driver.quit();
	}
	@Test
	public void EntrarEmContato() {
	page.contact(); //contato
	dsl.selecionarCombo("id_contact", "Customer service");
	page.setLogin("y.macielsena@gmail.com");//email
	page.setReferenciaPedido("1234");
	page.setMensagem("TESTANDO");
	
//	driver.findElement(By.id("fileUpload")).click();

	//WebElement file_input = driver.findElement(By.id("fileUpload"));
	//file_input.sendKeys("C:\\Users\\yuri-\\Downloads\\CursoSelenium");
	
	page.enviarContato();
	
	Assert.assertTrue(page.obterResultadoConfirmacaoDeEnvio().startsWith("Your message has been successfully sent to our team."));
	
	
	}
}