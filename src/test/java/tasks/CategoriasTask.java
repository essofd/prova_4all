package tasks;

import org.openqa.selenium.WebDriver;

import objects.CategoriasObject;

public class CategoriasTask {
	private CategoriasObject categoria;
	
	public CategoriasTask(WebDriver driver) {
		this.categoria = new CategoriasObject(driver);
	}

	public void adicionaDocesCarrinho() {
		categoria.adicionaCategoriaCarrinho("Brigadeiro").click();
		categoria.adicionaCategoriaCarrinho("Alfajor").click();
	}
	
	public void adicionaBebidasCarrinho() {
		categoria.adicionaCategoriaCarrinho("Coca-cola lata").click();
		categoria.adicionaCategoriaCarrinho("Fanta uva lata").click();
		categoria.adicionaCategoriaCarrinho("Água mineral sem gás").click();
	}
	
	public void adicionaRisoleCarrinho() {
		categoria.adicionaCategoriaCarrinho("Rissole médio").click();
	}
	
	

}
