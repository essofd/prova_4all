package tasks;

import org.openqa.selenium.WebDriver;

import objects.CarrinhoObject;


public class CarrinhoTask {
	private CarrinhoObject carrinho;

	public CarrinhoTask(WebDriver driver) {
		this.carrinho = new CarrinhoObject(driver);
	}

	public void aumentaQdteProdutoBrigadeiro(int qtde) {
		aumentaQdteProduto(qtde, "Brigadeiro");
	}

	public void aumentaQdteProdutoRisole(int qtde) {
		aumentaQdteProduto(qtde, "Rissole médio");
	}

	public void diminuiQdteProdutoRisole(int qtde) {
		diminuiQdteProduto(qtde, "Rissole médio");
	}

	public void aumentaQdteProduto(int qtde, String tipo) {
		for (int i = 0; i < qtde; i++) {
			carrinho.aumentaQtdeProduto(tipo).click();
		}
	}

	public void diminuiQdteProduto(int qtde, String tipo) {
		for (int i = 0; i < qtde; i++) {
			carrinho.diminuiQtdeProduto(tipo).click();
		}
	}

	public double getTotalPreco(String item) {
		switch (item.toLowerCase()) {
		case "coca-cola lata":
			return getQuantidadeCocaCola() * getPrecoCocaCola();
		case "fanta uva lata":
			return getQuantidadeFantaUva() * getPrecoFantaUva();
		case "água mineral sem gás":
			return getQuantidadeAguaMineral() * getPrecoAguaMineral();
		case "rissole médio":
			return getQuantidadeRissole() * getPrecoRissole();
		}
		return 0;
	}

	public int getQuantidadeCocaCola() {
		return Integer.parseInt(carrinho.qtdProduto("Coca-cola lata").getText());
	}

	public int getQuantidadeFantaUva() {
		return Integer.parseInt(carrinho.qtdProduto("Fanta uva lata").getText());
	}

	public int getQuantidadeAguaMineral() {
		return Integer.parseInt(carrinho.qtdProduto("Água mineral sem gás").getText());
	}

	public int getQuantidadeRissole() {
		return Integer.parseInt(carrinho.qtdProduto("Rissole médio").getText());
	}

	public double getPrecoCocaCola() {
		return getPreco(carrinho.prcProduto("Coca-cola lata").getText());
	}

	public double getPrecoFantaUva() {
		return getPreco(carrinho.prcProduto("Fanta uva lata").getText());
	}

	public double getPrecoAguaMineral() {
		return getPreco(carrinho.prcProduto("Água mineral sem gás").getText());
	}

	public double getPrecoRissole() {
		return getPreco(carrinho.prcProduto("Rissole médio").getText());
	}

	public double getPreco(String preco) {
		return Double.parseDouble(preco.replace("R$ ", "").replace(",", "."));
	}

	public void finalizaCompras() {
		carrinho.finalizaCompras().click();
	}

	public void fechar() {
		carrinho.fechar().click();
	}

}
