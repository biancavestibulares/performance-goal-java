package eCommerce.model;

public class ProdutoSalgado extends Produto{

	//Variável
	private String nomeSalgado;

	//Construtor
	public ProdutoSalgado(String nomeProduto, int tipoProduto, int idProduto, float precoProduto, String nomeSalgado) {
		super(nomeProduto, tipoProduto, idProduto, precoProduto);
		this.nomeSalgado = nomeSalgado;
	}

	//Getters e Setters
	public String getNomeSalgado() {
		return nomeSalgado;
	}

	public void setNomeSalgado(String nomeSalgado) {
		this.nomeSalgado = nomeSalgado;
	}

	//Adicionando salgado na visualização
	@Override//Para poder usar um método já existente na classe-mãe
	public void visualizar() {
		super.visualizar();
		System.out.println("Salgado: " + this.nomeSalgado);
		System.out.println("\n*************************************************");
	}

}
