package Testes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Auxiliares.DSL;
import Auxiliares.ItemPage;

public class TesteCarrinho {
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
	public void AddEExcluirItemCarrinho() throws InterruptedException {
	page.clicarItem();
	page.addCarrinho();
	Thread.sleep(2000);
	page.continuarCompra();
	Assert.assertTrue(page.obterResultadoProdutoNoCarrinho().startsWith("Your shopping cart contains: 1 Product"));
	page.excluirCarrinho();
	Thread.sleep(2000);
	Assert.assertTrue(page.obterResultadoCarrinhoVazio().startsWith("Your shopping cart is empty."));
	}
}
