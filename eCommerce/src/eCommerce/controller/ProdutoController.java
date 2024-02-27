package eCommerce.controller;

import java.util.ArrayList;

import eCommerce.model.Produto;
import eCommerce.repository.ProdutoRepository;
import eCommerce.util.Cores;

public class ProdutoController implements ProdutoRepository{
	//Import da classe Cores
	Cores cores = new Cores();

	//Criando um ArrayList para guardar os dados das contas cadastradas
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	//Variável
	int id = 0;

	@Override
	public void cadastrarProduto(Produto produto) {
		// TODO Auto-generated method stub
		listaProdutos.add(produto); //Adiciona o produto cadastrado no Array listaProdutos
		System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "O " + produto.getIdProduto() + "° foi cadastrado com sucesso!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
	}

	@Override
	public void listarProdutos() {
		// TODO Auto-generated method stub
		for(var produto : listaProdutos) { //Identifica cada produto dentro de listaProdutos
			produto.visualizar(); //Exibe a lista
		}

		//Verifica se a lista está vazia para dar um retorno ao usuário
		if(listaProdutos.isEmpty()) {
			System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nA lista está vazia!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
			System.out.println("                                                 ");
			System.out.println("*************************************************");
		}

	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		//Buscar o produto dentro da collection
		var buscarProduto = buscarNaCollection(produto.getIdProduto());
		
		if(buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto); //Seleciona o produto informado pelo usuário
			System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nO " + id + "° produto foi atualizado com sucesso!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
			System.out.println("                                                 ");
			System.out.println("*************************************************");
		} else {
			//Produto não encontrado
			System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "Produto não encontrado no estoque!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
			System.out.println("                                                 ");
			System.out.println("*************************************************");
		}
	}

	@Override
	public void buscarPorID(int id) {
		// TODO Auto-generated method stub
		//Procura o objeto produto dentro da collection de acordo com o id recebido
		var produto = buscarNaCollection(id);

		if(produto != null) //Se o ID não está vazio
			produto.visualizar(); //Exibe os dados do produto
		else {
			//Produto não encontrado
			System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "Produto não encontrado no estoque!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
			System.out.println("                                                 ");
			System.out.println("*************************************************");
		}
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		//Procurar o produto dentro da collection
		var produto = buscarNaCollection(id);

		if(produto != null) { //Se o produto não é nulo, ou seja, foi encontrado
			if(listaProdutos.remove(produto) == true) { //Remove da lista
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + produto.getNomeProduto() + " foi deletado(a) com sucesso!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
				System.out.println("                                                 ");
				System.out.println("*************************************************");
			}
		} else {
			//Produto não encontrado
			System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "Produto não encontrado no estoque!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
			System.out.println("                                                 ");
			System.out.println("*************************************************");
		}

	}

	//Cada produto cadastrado possui um ID
	public int gerarID() {
		return ++ id; //Aumenta um número sempre que um ID é cadastrado

	}

	//Buscando um ID respectivo na coleção Array
	public Produto buscarNaCollection(int id) {
		for(var produto : listaProdutos) {
			if(produto.getIdProduto() == id) { //Procura o ID do produto cadastrado
				return produto; //Retorna o produto encontrado
			}
		}
		return null;
	}

}
