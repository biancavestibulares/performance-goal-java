package eCommerce.model;

public class ProdutoDoce extends Produto{
	
	//Variável
	private String nomeDoce;

	//Construtor
	public ProdutoDoce(String nomeProduto, int tipoProduto, int idProduto, float precoProduto, String nomeDoce) {
		super(nomeProduto, tipoProduto, idProduto, precoProduto);
		this.nomeDoce = nomeDoce;
	}

	//Getters e Setters
	public String getNomeDoce() {
		return nomeDoce;
	}

	public void setNomeDoce(String nomeDoce) {
		this.nomeDoce = nomeDoce;
	}
	
	//Adicionando doce na visualização
	@Override//Para poder usar um método já existente na classe-mãe
	public void visualizar() {
		super.visualizar();
		System.out.println("Doce: " + this.nomeDoce);
		System.out.println("\n*************************************************");
	}

}
