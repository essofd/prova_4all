package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeObject {

	private WebDriver driver;

	public HomeObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement acessaCategoria() {
		return this.driver.findElement(By.id("open-categories-btn"));
	}

	public WebElement setCategoria(String categoria) {
		return this.driver.findElement(By.xpath("*//div/ul/li[contains(text(), '" + categoria + "')]"));
	}

	public WebElement acessaCarrinho() {
		return this.driver.findElement(By.id("cart-btn"));
	}

}
