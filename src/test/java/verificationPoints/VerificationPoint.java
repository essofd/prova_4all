package verificationPoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import utils.Report;
import utils.Screenshot;

public class VerificationPoint extends Report {
	private String CHECK_MSG = "Pedido realizado com sucesso!";

	private WebDriver driver;

	public VerificationPoint(WebDriver driver) {
		this.driver = driver;
	}

	private boolean contemPagina(String text) {
		return this.driver.getPageSource().contains(text);
	}

	private double getTotal() {
		return getTotal(this.driver.findElement(By.id("price-total-checkout")).getText());
	}
	
	private double getTotal(String tot) {
		return Double.parseDouble(tot.replace("R$ ", "").replace(",", ".") );
	}
	

	public void verificaCompraSucesso() {
		if (this.contemPagina(CHECK_MSG)) {
			logSucesso("Compra realizada com sucesso.");
			log(Status.PASS, "Validação: Compra realizada com sucesso.", Screenshot.capture(driver));
		} else {
			logErro("Falha ao comprar.");
			log(Status.FAIL, "Validação: Falha ao comprar.", Screenshot.capture(driver));
		}
	}

	public void validaTotalProdutos(double total) {
		if (total==getTotal()) {
			logSucesso("Valor total da compra correto.");
			log(Status.PASS, "Validação: Valor total da compra correto.", Screenshot.capture(driver));
		} else {
			logErro("Valor total da compra incorreto.");
			log(Status.FAIL, "Validação: Valor total da compra incorreto.", Screenshot.capture(driver));
		}
	}

}
