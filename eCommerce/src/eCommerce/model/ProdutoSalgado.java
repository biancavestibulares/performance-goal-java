package eCommerce.model;

public class ProdutoSalgado extends Produto{

	//Variável
	private float qntdProteinas;

	//Construtor
	public ProdutoSalgado(String nomeProduto, int tipoProduto, int idProduto, float precoProduto, float qntdProteinas) {
		super(nomeProduto, tipoProduto, idProduto, precoProduto);
		this.qntdProteinas = qntdProteinas;
	}

	//Getters e Setters
	public float getQntdProteinas() {
		return qntdProteinas;
	}

	public void setQntdProteinas(float qntdProteinas) {
		this.qntdProteinas = qntdProteinas;
	}

	//Adicionando salgado na visualização
	@Override//Para poder usar um método já existente na classe-mãe
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de proteínas: " + this.qntdProteinas + "g");
		System.out.println("\n*************************************************");
	}

}
