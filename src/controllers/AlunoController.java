package controllers;

import java.util.Scanner;

import entities.Aluno;
import repositories.AlunoRepository;

public class AlunoController {

	private AlunoRepository alunoRepository = new AlunoRepository();
	private Scanner scanner = new Scanner(System.in);

	// CADASTRAR ALUNO

	public void cadastrarALuno() {
		try {
			Aluno aluno = new Aluno();
			System.out.println("\nCADASTRO DO ALUNO: ");

			System.out.println("NOME DO ALUNO: ");
			aluno.setNome(scanner.nextLine());

			System.out.println("MATRICULA DO ALUNO: ");
			aluno.setMatricula(scanner.nextLine());

			System.out.println("CPF DO ALUNO: ");
			aluno.setCpf(scanner.nextLine());

			alunoRepository.inserir(aluno);

		}

		catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}

	// ATUALIZAR ALUNO

	public void atualizarAluno() {
		try {
			Aluno aluno = new Aluno();
			System.out.println("\nATUALIZAR O ALUNO: ");

			System.out.println("ID DO ALUNO: ");
			aluno.setIdAluno(Integer.parseInt(scanner.nextLine()));

			System.out.println("ATUALIZAR O NOME DO ALUNO: ");
			aluno.setNome(scanner.nextLine());

			System.out.println("ATUALIZAR MATRICULA DO ALUNO: ");
			aluno.setMatricula(scanner.nextLine());

			System.out.println("ATUALIZAR CPF DO ALUNO: ");
			aluno.setCpf(scanner.nextLine());

			alunoRepository.atualizar(aluno);

		}

		catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}

	// DELETER O ALUNO

	public void deletarAluno() {
		try {
			System.out.println("\nEXCLUIR ALUNO: ");

			System.out.println("ID DO ALUNO: ");
			Integer idAluno = Integer.parseInt(scanner.nextLine());

			alunoRepository.excluir(idAluno);

		}

		catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}

	// CONSULTAR O ALUNO

	public void consultarAluno() {
		try {

			System.out.println("\nCONSULTAR ALUNO: ");
			alunoRepository.consultar();

		}

		catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}

}
