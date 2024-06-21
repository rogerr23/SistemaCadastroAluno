package principal;

import java.util.Scanner;

import controllers.AlunoController;

public class Main {

	public static void main(String[] args) {
		AlunoController alunoController = new AlunoController();

		Scanner scanner = new Scanner(System.in);
		System.out.println("(1) CADASTRAR ALUNO");
		System.out.println("(2) ATUALIZAR ALUNO");
		System.out.println("(3) EXCLUIR ALUNO");
		System.out.println("(4) CONSULTAR ALUNO");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");

		Integer opcao = Integer.parseInt(scanner.nextLine());

		switch (opcao) {

		case 1:
			alunoController.cadastrarALuno();
			break;

		case 2:
			alunoController.atualizarAluno();
			break;

		case 3:
			alunoController.deletarAluno();
			break;

		case 4:
			alunoController.consultarAluno();
			break;

		default:
			System.out.println("\n OPÇAO INVALIDA!");

		}

		scanner.close();
	}

}
