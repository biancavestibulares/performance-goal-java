package eCommerce.model;

public abstract class Produto {

	//Atributos da loja
	private String nomeProduto;
	private int tipoProduto;
	private int idProduto;
	private float precoProduto;

	//Construtor
	public Produto(String nomeProduto, int tipoProduto, int idProduto, float precoProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.idProduto = idProduto;
		this.precoProduto = precoProduto;
	}

	//Getters e Setters
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	//Método de exibição dos dados
	public void visualizar() {
		//Criando um método para seleção do tipo de produto
		String tipo = " ";

		switch(this.tipoProduto) {
		case 1: 
			tipo = "Doce";
			break;
		case 2:
			tipo = "Salgado";
			break;
		}

		//Imprimindo os dados recolhidos na classe Menu
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("\n                Dados do Produto                 ");
		System.out.println("\nProduto: " + this.nomeProduto);
		System.out.println("Tipo de produto: " + tipo);
		System.out.println("ID produto: " + this.idProduto);
		System.out.println("Preço unitário: R$" + this.precoProduto);
	}
	
}
