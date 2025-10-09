package aplicacao;

import java.util.Scanner;

import arvores.AVLint;

public class MenuAVL {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		int opcao;
		AVLint avl = new AVLint();
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Mostra Fator de Balanceamento");
			System.out.println("3 - Remover");
			System.out.println("4 - conta nos");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa");
				break;
			case 1:
				System.out.print("Informe valor a ser inserido: ");
				int valor = le.nextInt();
				avl.root = avl.inserirAVL(avl.root, valor);
				avl.atualizaAlturas(avl.root);
				break;
			case 2:
				System.out.println("Apresentacao da AVL");
				avl.mostrarFP(avl.root);
				break;
				case 3:
					System.out.println("Informe o valor a ser removido");
					valor = le.nextInt();
					avl.root = avl.removeValor(avl.root, valor);
					break;
				case 4:
					System.out.println(avl.contaNos(avl.root, 0));
					break;

			default:
				System.out.println("Opcao invalida");
			}
		}while (opcao!=0);
		

	}

}
