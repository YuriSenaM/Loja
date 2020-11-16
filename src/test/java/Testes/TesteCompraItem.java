package Testes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Auxiliares.DSL;
import Auxiliares.ItemPage;

public class TesteCompraItem {
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
	public void CompraItem() throws InterruptedException {
	page.sign(); //botão de sign
	page.setLogin("y.macielsena@gmail.com");//email
	page.setSenha("info@123");//senha
	page.login(); //login
	Thread.sleep(2000);
	page.home();
	Thread.sleep(2000);
	page.clicarItem();
	page.addCarrinho();
	Thread.sleep(2000);
	page.continuarCompra();
	Assert.assertTrue(page.obterResultadoProdutoNoCarrinho().startsWith("Your shopping cart contains: 1 Product"));
	Thread.sleep(2000);
	page.continuarCompraCarrinho();
	Thread.sleep(2000);
	page.continuarCompraCarrinhoAdress();
	dsl.clicarCheck("cgv");
	page.continuarCompraCarrinhoShipping();
	page.continuarCompraCarrinhoPagamento();
	page.continuarCompraCarrinhoConfirmarCompra();
	Assert.assertTrue(page.obterResultadoCompraConfirmada().startsWith("Your order on My Store is complete."));

	}	
}