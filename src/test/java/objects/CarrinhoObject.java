package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarrinhoObject {
	private WebDriver driver;

	public CarrinhoObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement aumentaQtdeProduto(String produto) {
		return this.driver.findElement(
				By.xpath("*//div[contains(text(), '" + produto + "')]/../div/div/span[contains(text(), '+')]"));
	}

	public WebElement diminuiQtdeProduto(String produto) {
		return this.driver.findElement(
				By.xpath("*//div[contains(text(), '" + produto + "')]/../div/div/span[contains(text(), '-')]"));
	}

	public WebElement finalizaCompras() {
		return this.driver.findElement(By.id("finish-checkout-button"));
	}

	public WebElement fechar() {
		return this.driver.findElement(By.xpath("*//button[contains(text(), 'Fechar')]"));
	}

	public WebElement qtdProduto(String produto) {
		return this.driver.findElement(By.xpath("*//div[contains(text(),'" + produto + "')]/../div/p"));

	}

	public WebElement prcProduto(String produto) {
		return this.driver.findElement(By.xpath("*//div[contains(text(),'" + produto + "')]/../../p"));

	}

}
