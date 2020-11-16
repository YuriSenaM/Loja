package Testes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Auxiliares.DSL;
import Auxiliares.ItemPage;
public class TesteEsqueceuSenha {

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
	public void RecuperarSenha(){
		page.sign(); //login
		page.forgotpassword();//forgot password
		page.setLogin("y.macielsena@gmail.com");//email
		page.retrievepassword(); //retrieve password
		
		Assert.assertTrue(page.obterResultadoRecuperarSenha().startsWith("A confirmation email has been sent to your address: y.macielsena@gmail.com"));
		
	}
	
}

