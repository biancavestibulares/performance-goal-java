package eCommerce.repository;

import eCommerce.model.Produto;

public interface ProdutoRepository {

	//Criando os métodos CRUD (Create, Read, Update e Delete)
	public void cadastrarProduto(Produto produto); //Inserir produto
	public void listarProdutos(); //Listar produtos
	public void atualizar(Produto produto); //Atualizar dados da conta
	public void buscarPorID(int id); //Buscar produto pelo seu ID
	public void deletar(int id); //Deletar conta
	
}
