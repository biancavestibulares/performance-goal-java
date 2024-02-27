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
	int iD = 0;

	@Override
	public void cadastrarProduto(Produto produto) {
		// TODO Auto-generated method stub
		listaProdutos.add(produto); //Adiciona o produto cadastrado no Array listaProdutos
		System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "O " + produto.getIdProduto() + "° foi cadastrado com sucesso!" + Cores.TEXT_RESET);
	}

	@Override
	public void listarProdutos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPorID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}
	
	//Cada conta criada é identificada por um número
		public int gerarID() {
			
		}

}
