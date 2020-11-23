package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import tasks.CarrinhoTask;
import tasks.CategoriasTask;
import tasks.HomeTask;
import utils.Drivers;
import utils.Report;
import utils.Screenshot;
import verificationPoints.VerificationPoint;

public class DesafioUmTestCase {
	private WebDriver driver;
	private HomeTask home;
	private CategoriasTask categoria;
	private CarrinhoTask carrinho;
	private VerificationPoint verification;
	
	@Before
	public void setUp() {
		Report.start("Teste 1 - Realizar um pedido com sucesso.");
		driver = Drivers.getChromeDriver();

		home =new HomeTask(driver);
		categoria=new CategoriasTask(driver);
		carrinho=new CarrinhoTask(driver);
		verification = new VerificationPoint(driver);
		
		driver.get("https://shopcart-challenge.4all.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Report.log(Status.INFO, "O website foi carregado.", Screenshot.capture(driver));
		
	}
	@Test
	public void deveRealizarDesafio1() {

		home.selecionaCategoriaDoces();
		categoria.adicionaDocesCarrinho();
		Report.log(Status.INFO, "Doces adicionados ao carrinho", Screenshot.capture(driver));
		
		home.selecionaCategoriaTodos();
	    Report.log(Status.INFO, "Acessa a todas as categorias", Screenshot.capture(driver));
	    
	    home.acessaCarrinho();
	    carrinho.aumentaQdteProdutoBrigadeiro(4);
	    Report.log(Status.INFO, "Aumenta a quantidade do produto brigadeiro em 4 unidades.", Screenshot.capture(driver));
	    
	    carrinho.finalizaCompras();
	    Report.log(Status.INFO, "Finaliza as compras", Screenshot.capture(driver));
	    
	    verification.verificaCompraSucesso();
	    
	    carrinho.fechar();
	    
		
		}
	@After
	public void tearDown() {
		driver.quit();
	}
}