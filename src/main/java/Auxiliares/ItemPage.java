package Auxiliares;
import org.openqa.selenium.WebDriver;

public class ItemPage {
private DSL dsl;
	
	public ItemPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	
	/*************************Inserções********************************/
	public void setLogin(String login) {
		dsl.escrever("email", login);
	}
	
	public void setSenha(String senha) {
		dsl.escrever("passwd", senha);
	}
	
	public void setReferenciaPedido(String order) {
		dsl.escrever("id_order", order);
	}
	
	public void setMensagem(String mensagem) {
		dsl.escrever("message", mensagem);
	}

	/*************************Combos********************************/
	public void setTituloAssunto(String valor) {
		dsl.selecionarCombo("id_contact", valor);
	}

	
/*************************Botões********************************/	
	public void login(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span");
	}
	
	public void sign(){
		dsl.clicarBotao("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
	}
	
	public void forgotpassword(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[1]/a");
	}
	
	public void retrievepassword(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/p/button/span");
	}
	
	public void contact(){
		dsl.clicarBotao("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a");
	}
	
	public void enviarContato(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/form/fieldset/div[2]/button/span");
	}
	
	public void clicarItem(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[1]/img");
	}
	
	public void addCarrinho(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span");
	}
	public void continuarCompra(){
		dsl.clicarBotao("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span");
	}
	
	public void excluirCarrinho(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/a/i");
	}
	
	public void home(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[1]/a/i");
	}
	public void continuarCompraCarrinho(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span");
	}
	public void continuarCompraCarrinhoAdress(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/form/p/button/span");
	}
	public void continuarCompraCarrinhoShipping(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span");
	}
	
	public void continuarCompraCarrinhoPagamento(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a");
	}
	
	public void continuarCompraCarrinhoConfirmarCompra(){
		dsl.clicarBotao("/html/body/div/div[2]/div/div[3]/div/form/p/button/span");
	}
	
	/*public void anexar(){
		dsl.clicarBotao("fileUpload");
	}*/
	
	/*************************Confirmações de Mensagens ********************************/
	public String obterResultadoLogin(){
		return dsl.obterTexto("/html/body/div/div[2]/div/div[3]/div/p");
	}
	
	public String obterResultadoRecuperarSenha(){
		return dsl.obterTexto("/html/body/div/div[2]/div/div[3]/div/div/p");
	}
	
	public String obterResultadoConfirmacaoDeEnvio(){
		return dsl.obterTexto("/html/body/div/div[2]/div/div[3]/div/p");
	}
	
	public String obterResultadoProdutoNoCarrinho(){
		return dsl.obterTexto("/html/body/div/div[2]/div/div[3]/div/h1/span");
	}
	public String obterResultadoCarrinhoVazio(){
		return dsl.obterTexto("/html/body/div/div[2]/div/div[3]/div/p");
	}
	public String obterResultadoCompraConfirmada(){
		return dsl.obterTexto("/html/body/div/div[2]/div/div[3]/div/div/p/strong");
	}
		
}



