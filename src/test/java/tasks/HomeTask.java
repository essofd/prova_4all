package tasks;

import org.openqa.selenium.WebDriver;

import objects.HomeObject;

public class HomeTask {

	private HomeObject home;

	public HomeTask(WebDriver driver) {
		this.home = new HomeObject(driver);
	}

	public void selecionaCategoriaDoces() {
		acessaCategoria("Doces");
	}

	public void selecionaCategoriaTodos() {
		acessaCategoria("Todos");
	}

	public void selecionaCategoriaBebidas() {
		acessaCategoria("Bebidas");
	}

	public void acessaCategoria(String cat) {
		home.acessaCategoria().click();
		home.setCategoria(cat).click();
	}

	public void acessaCarrinho() {
		home.acessaCarrinho().click();
	}

}
