package eCommerce.model;

public class ProdutoDoce extends Produto{
	
	//Variável
	private float qntdCalorias;

	//Construtor
	public ProdutoDoce(String nomeProduto, int tipoProduto, int idProduto, float precoProduto, float qntdCalorias) {
		super(nomeProduto, tipoProduto, idProduto, precoProduto);
		this.qntdCalorias = qntdCalorias;
	}

	//Getters e Setters
	public float getQntdCalorias() {
		return qntdCalorias;
	}

	public void setQntdCalorias(float qntdCalorias) {
		this.qntdCalorias = qntdCalorias;
	}
	
	//Adicionando doce na visualização
	@Override//Para poder usar um método já existente na classe-mãe
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de calorias: " + this.qntdCalorias + "kcal");
		System.out.println("\n*************************************************");
	}

}
