package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriasObject {
	private WebDriver driver;

	public CategoriasObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement adicionaCategoriaCarrinho(String tipo) {
		return this.driver.findElement(By.xpath("*//div/h1[contains(text(), '" + tipo + "')]/../../../div/button"));
	}

}
