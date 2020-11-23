package testCases;

import java.util.ArrayList;
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

public class DesafioDoisTestCase {
	private WebDriver driver;
	private HomeTask home;
	private CategoriasTask categoria;
	private CarrinhoTask carrinho;
	private VerificationPoint verification;
	
	@Before
	public void setUp() {
		Report.start("Teste 2 - Realizar um pedido com sucesso.");
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
	public void deveRealizarDesafio2() {

		home.selecionaCategoriaBebidas();
		categoria.adicionaBebidasCarrinho();
		Report.log(Status.INFO, "Bebidas adicionadas ao carrinho", Screenshot.capture(driver));
		
		home.selecionaCategoriaTodos();
	    Report.log(Status.INFO, "Acessa a todas as categorias", Screenshot.capture(driver));
	    
	    categoria.adicionaRisoleCarrinho();
	    home.acessaCarrinho();   
	    
	    carrinho.aumentaQdteProdutoRisole(9);
	    Report.log(Status.INFO, "Aumenta a quantidade do produto risole médio em 9 unidades.", Screenshot.capture(driver));
	    
	    carrinho.diminuiQdteProdutoRisole(5);
	    Report.log(Status.INFO, "Diminui a quantidade do produto risole médio em 5 unidades.", Screenshot.capture(driver));  
	    
	    
	    ArrayList<String> itens = new ArrayList<String>();
	    itens.add("Coca-cola lata");
	    itens.add("Fanta uva lata");
	    itens.add("água mineral sem gás");
	    itens.add("Rissole médio");
	    
	    double total = 0;

		for (String item : itens) {
			total += carrinho.getTotalPreco(item);			
		}
	    
	    
	    verification.validaTotalProdutos(total);
	    
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