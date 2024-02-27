package eCommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import eCommerce.util.Cores;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		//Variáveis
		int opcao = 0;

		while(true) {
			//Imprimindo no console as opções do menu
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_CYAN_BACKGROUND_BRIGHT);
			System.out.println("                                                 ");
			System.out.println("                  BIBI's DOCES                   ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("       Opção 1 - Cadastrar                       ");
			System.out.println("       Opção 2 - Cadastrar produto               ");
			System.out.println("       Opção 3 - Listar produtos                 ");
			System.out.println("       Opção 4 - Atualizar dados produto         ");
			System.out.println("       Opção 5 - Comprar                         ");
			System.out.println("       Opção 6 - Apagar produto                  ");
			System.out.println("       Opção 7 - Sair                            ");
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
				System.out.println(Cores.TEXT_WHITE_BOLD + "Por favor, escolha uma das opções do Menu" + Cores.TEXT_RESET); //Instrução
			}
			
			//Criando casos para cada uma das opções
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_CYAN_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("                CADASTRAR CLIENTE                ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				
				System.out.println(Cores.TEXT_RESET);
			break;
			
			case 2:
				System.out.println(Cores.TEXT_CYAN_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("                CADASTRAR PRODUTO                ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				
				System.out.println(Cores.TEXT_RESET);
			break;
			
			case 3:
				System.out.println(Cores.TEXT_CYAN_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("                 LISTAR PRODUTOS                 ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				
				System.out.println(Cores.TEXT_RESET);
			break;
				
			case 4:
				System.out.println(Cores.TEXT_CYAN_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("           ATUALIZAR DADOS DO PRODUTO            ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				
				System.out.println(Cores.TEXT_RESET);
			break;
				
			case 5:
				System.out.println(Cores.TEXT_CYAN_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("                 APAGAR PRODUTO                  ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				
				System.out.println(Cores.TEXT_RESET);
			break;
				
			case 6:
				System.out.println(Cores.TEXT_CYAN_BRIGHT);
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				System.out.println("                     COMPRAR                     ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				
				System.out.println(Cores.TEXT_RESET);
			break;
			
			case 7:
				//Finalização do sistema
				System.out.println(Cores.TEXT_WHITE + Cores.ANSI_CYAN_BACKGROUND_BRIGHT);
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

}
