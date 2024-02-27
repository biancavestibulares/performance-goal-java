package eCommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import eCommerce.controller.ProdutoController;
import eCommerce.model.Produto;
import eCommerce.model.ProdutoDoce;
import eCommerce.model.ProdutoSalgado;
import eCommerce.util.Cores;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		//Importação das classe e repositórios
		Produto novoProduto = new Produto(null, 0, 0, 0) {
		};
		ProdutoController produtos = new ProdutoController();

		//Variáveis
		int opcao = 0;

		//Variáveis de produto
		String nomeProduto;
		int tipoProduto = 0;
		int idProduto = 0;
		float precoProduto = 0;
		float qntdCalorias = 0;
		float qntdProteinas = 0;


		while(true) {			
			//Imprimindo no console as opções do menu
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_RED_BACKGROUND_BRIGHT);
			System.out.println("                                                 ");
			System.out.println("                  BIBI's DOCES                   ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("       Opção 1 - Cadastrar produto               ");
			System.out.println("       Opção 2 - Listar produtos                 ");
			System.out.println("       Opção 3 - Atualizar dados produto         ");
			System.out.println("       Opção 4 - Consultar produto por ID        ");
			System.out.println("       Opção 5 - Apagar produto                  ");
			System.out.println("       Opção 6 - Sair                            ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println(Cores.TEXT_RESET);
			System.out.print("Insira a opção desejada: ");
			System.out.println("                                                 ");

			//Criando um TryCatch no caso do usuário digitar uma String ao invés de um int
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) { //InputMismatchException é um erro captado quando a devolução não é um int
				System.err.println("\nExceção: " + e); //System.err.println imprime a exceção/erro - informa o usuário do problema encontrado
				leia.nextLine();
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "Por favor, escolha uma das opções do Menu" + Cores.TEXT_RESET); //Instrução
			}

			//Criando casos para cada uma das opções
			switch(opcao) {	
			case 1:
				//Variáveis TryCatch
				boolean loop1 = true;
				boolean loop2 = true;
				boolean loop3 = true;
				boolean loop4 = true;

				System.out.println(Cores.TEXT_RED_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("                CADASTRAR PRODUTO                ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");

				//Nome do produto
				System.out.println("Digite o nome do produto: "); //Ex: Brigadeiro, bolo, etc.
				System.out.println(Cores.TEXT_WHITE_BOLD);
				nomeProduto = leia.next();
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

				//Preço do produto
				do {
					try {
						System.out.println("Digite o valor unitário do produto (R$): ");
						System.out.println(Cores.TEXT_WHITE_BOLD);
						precoProduto = leia.nextFloat();
						System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

						loop1 = false;

					} catch (InputMismatchException e) { //Devolução de erro
						System.out.println("                                                 ");
						System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
						leia.nextLine();
						System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
						System.out.println("                                                 ");
					} 
				} while(loop1);

				//Tipo de produto
				do {
					try {
						System.out.println("Digite o tipo de produto, 1 doce, 2 salgado: ");
						System.out.println(Cores.TEXT_WHITE_BOLD);
						tipoProduto = leia.nextInt();
						System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

						loop2 = false;

					} catch (InputMismatchException e) { //Devolução de erro
						System.out.println("                                                 ");
						System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
						leia.nextLine();
						System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
						System.out.println("                                                 ");
					} 
				} while(tipoProduto < 1 && tipoProduto > 2 && loop2);

				if(tipoProduto == 1 || tipoProduto == 2) {
					switch(tipoProduto) {
					//Case para caso um doce tenha sido selecionado como tipo de produto
					case 1 -> {
						do {
							try {
								System.out.println("Digite a quantidade de calorias (Kcal): "); 
								System.out.println(Cores.TEXT_WHITE_BOLD);
								qntdCalorias = leia.nextFloat();
								System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

								System.out.println("\n");
								//Cadastra as informações fornecidas pelo usuário, e o salva como um produto do Array/Lista de contas
								produtos.cadastrarProduto(new ProdutoDoce(nomeProduto, tipoProduto, produtos.gerarID(), precoProduto, qntdCalorias));

								loop3 = false;

							} catch (InputMismatchException e) { //Devolução de erro
								System.out.println("                                                 ");
								System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
								leia.nextLine();
								System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
								System.out.println("                                                 ");
							} 
						} while(loop3);
					}

					//Case para caso um salgado tenha sido selecionado como tipo de produto
					case 2 -> {
						do {
							try {
								System.out.println("Digite a quantidade de proteínas (g): "); 
								System.out.println(Cores.TEXT_WHITE_BOLD);
								qntdProteinas = leia.nextFloat();
								System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

								System.out.println("\n");
								produtos.cadastrarProduto(new ProdutoSalgado(nomeProduto, tipoProduto, produtos.gerarID(), precoProduto, qntdProteinas));

								loop4 = false;

							} catch (InputMismatchException e) { //Devolução de erro
								System.out.println("                                                 ");
								System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
								leia.nextLine();
								System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
								System.out.println("                                                 ");
							} 
						} while(loop4);
					}

					} //Fim do SwitchCase

				} else {
					System.out.println("                                                 ");
					System.out.println(Cores.TEXT_RED_BOLD + "Tipo de conta inválida!" + Cores.TEXT_RESET);
				}

				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println(Cores.TEXT_RESET);
				continuarPrograma();
				break;

			case 2:
				System.out.println(Cores.TEXT_RED_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("                 LISTAR PRODUTOS                 ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");

				//Lista as contas adicionadas em ProdutoController
				produtos.listarProdutos();

				System.out.println(Cores.TEXT_RESET);
				continuarPrograma();
				break;

			case 3:
				//Variáveis TryCatch
				boolean loop5 = true;
				boolean loop6 = true;
				boolean loop7 = true;

				System.out.println(Cores.TEXT_RED_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("           ATUALIZAR DADOS DO PRODUTO            ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");

				//Identificando o produto pelo ID
				do {
					try {
						System.out.print("\nDigite o número da conta que deseja atualizar: ");
						System.out.println(Cores.TEXT_WHITE_BOLD);
						idProduto = leia.nextInt();
						System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
						loop5 = false;

					} catch (InputMismatchException e) { //Devolução de erro
						System.out.println("                                                 ");
						System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
						leia.nextLine();
						System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
						System.out.println("                                                 ");
					} 
				} while(loop5);

				//Buscando por um produto especifico na collection
				var buscarProdutos = produtos.buscarNaCollection(idProduto);

				if(buscarProdutos != null) {
					tipoProduto = buscarProdutos.getTipoProduto(); //Declarando o tipo de produto

					//Nome do produto
					System.out.println("Digite o nome do produto: "); //Ex: Brigadeiro, bolo, etc.
					System.out.println(Cores.TEXT_WHITE_BOLD);
					nomeProduto = leia.next();
					System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

					//Preço do produto
					do {
						try {
							System.out.println("Digite o valor unitário do produto (R$): ");
							System.out.println(Cores.TEXT_WHITE_BOLD);
							precoProduto = leia.nextFloat();
							System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

							loop6 = false;

						} catch (InputMismatchException e) { //Devolução de erro
							System.out.println("                                                 ");
							System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
							leia.nextLine();
							System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
							System.out.println("                                                 ");
						} 
					} while(loop6);

					//Tipo de produto
					switch(tipoProduto) {
					//Case para caso um doce tenha sido selecionado como tipo de produto
					case 1 -> {
						do {
							try {
								System.out.println("Digite a quantidade de calorias (Kcal): "); 
								System.out.println(Cores.TEXT_WHITE_BOLD);
								qntdCalorias = leia.nextFloat();
								System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

								System.out.println("\n");
								//Atualiza as informações fornecidas pelo usuário, e o salva como um produto do Array/Lista de contas
								produtos.atualizar(new ProdutoDoce(nomeProduto, tipoProduto, idProduto, precoProduto, qntdCalorias));

								loop6 = false;

							} catch (InputMismatchException e) { //Devolução de erro
								System.out.println("                                                 ");
								System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
								leia.nextLine();
								System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
								System.out.println("                                                 ");
							} 
						} while(loop6);
					}

					//Case para caso um salgado tenha sido selecionado como tipo de produto
					case 2 -> {
						do {
							try {
								System.out.println("Digite a quantidade de proteínas (g): "); 
								System.out.println(Cores.TEXT_WHITE_BOLD);
								qntdProteinas = leia.nextFloat();
								System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

								System.out.println("\n");
								produtos.atualizar(new ProdutoSalgado(nomeProduto, tipoProduto, idProduto, precoProduto, qntdProteinas));

								loop7 = false;

							} catch (InputMismatchException e) { //Devolução de erro
								System.out.println("                                                 ");
								System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
								leia.nextLine();
								System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
								System.out.println("                                                 ");
							} 
						} while(loop7);
					}

					} //Fim do SwitchCase

				}

				System.out.println(Cores.TEXT_RESET);
				continuarPrograma();
				break;

			case 4:
				//Variáveis TryCatch
				boolean loop8 = true;

				System.out.println(Cores.TEXT_RED_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("            CONSULTAR PRODUTO POR ID             ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");

				//Declarando os valor da variável ID
				do {
					try {
						System.out.print("\nDigite o número da conta que deseja buscar: ");
						System.out.println(Cores.TEXT_WHITE_BOLD);
						idProduto = leia.nextInt();
						System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

						produtos.buscarPorID(idProduto); //Declarando os dados do produto

						loop8 = false;

					} catch (InputMismatchException e) { //Devolução de erro
						System.out.println("                                                 ");
						System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
						leia.nextLine();
						System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
						System.out.println("                                                 ");
					} 
				} while(loop8);

				System.out.println(Cores.TEXT_RESET);
				continuarPrograma();
				break;

			case 5:
				//Variáveis TryCatch
				boolean loop9 = true;

				System.out.println(Cores.TEXT_RED_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("                 APAGAR PRODUTO                  ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");

				//Identificando o produto pelo ID
				do {
					try {
						System.out.print("\nDigite o número da conta que deseja deletar: ");
						System.out.println(Cores.TEXT_WHITE_BOLD);
						idProduto = leia.nextInt();
						System.out.println(Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);

						produtos.deletar(idProduto); //Deletar

						loop9 = false;

					} catch (InputMismatchException e) { //Devolução de erro
						System.out.println("                                                 ");
						System.err.println(Cores.TEXT_RED_BOLD_BRIGHT + "Exceção: " + e); 
						leia.nextLine();
						System.out.println("Digite um número inteiro!" + Cores.TEXT_RESET + Cores.TEXT_RED_BRIGHT);
						System.out.println("                                                 ");
					} 
				} while(loop9);

				System.out.println(Cores.TEXT_RESET);
				continuarPrograma();
				break;

			case 6:
				//Finalização do sistema
				System.out.println(Cores.TEXT_WHITE + Cores.ANSI_RED_BACKGROUND_BRIGHT);
				System.out.println("                                                 ");
				System.out.println("     BIBI's DOCES agradeçe pela confiança ;)     ");
				sobre();
				System.out.println(Cores.TEXT_RESET);
				System.exit(0); //Fecha o programa
				break;

			} //Fim do SwitchCase

		} //Fim do while

	}

	//Método de exibição sobre
	public static void sobre() {
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("Projeto desenvolvido por Bianca V. de Andrade    ");
		System.out.println("/biancavestibulares/performance-goal-java.git    ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
	}

	//Exigir que a tecla ENTER do teclado seja pressionada para finalizar uma opção do Menu
	public static void continuarPrograma() {
		try {
			System.out.println("                                                 ");
			System.out.println("Pressione Enter para continuar");
			System.in.read();
		} catch(IOException e) {
			System.out.println("Pressione ENTER para continuar");
		}
	}

}
