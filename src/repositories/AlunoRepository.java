package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entities.Aluno;
import factories.ConnectionFactory;

public class AlunoRepository {

	private ConnectionFactory connectionFactory = new ConnectionFactory();

	// INSERIR UM ALUNO
	public void inserir(Aluno aluno) throws Exception {

		Connection connection = connectionFactory.getConnection();

		PreparedStatement statement = connection
				.prepareStatement("INSERT INTO aluno(nome, matricula, cpf) VALUES(?,?,?)");
		statement.setString(1, aluno.getNome());
		statement.setString(2, aluno.getMatricula());
		statement.setString(3, aluno.getCpf());
		statement.execute();

		connection.close();

		System.out.println("\nALUNO CADASTRADO COM SUCESSO! ");

	}

	// ATUALIZAR O ALUNO
	public void atualizar(Aluno aluno) throws Exception {

		Connection connection = connectionFactory.getConnection();

		PreparedStatement statement = connection
				.prepareStatement("UPDATE aluno SET nome =?, matricula =?, cpf =? WHERE idAluno=?");

		statement.setString(1, aluno.getNome());
		statement.setString(2, aluno.getMatricula());
		statement.setString(3, aluno.getCpf());
		statement.setInt(4, aluno.getIdAluno());
		statement.execute();

		connection.close();

		System.out.println("\nALUNO ATUALIZADO COM SUCESSO! ");

	}

	// EXCLUIR ALUNO
	public void excluir(Integer idAluno) throws Exception {

		Connection connection = connectionFactory.getConnection();

		PreparedStatement statement = connection.prepareStatement("DELETE FROM aluno WHERE idAluno =?");

		statement.setInt(1, idAluno);
		statement.execute();

		connection.close();

		System.out.println("\nALUNO DELETADO COM SUCESSO! ");

	}

	// CONSULTAR ALUNO
	public void consultar() throws Exception {

		Connection connection = connectionFactory.getConnection();

		PreparedStatement statement = connection.prepareStatement("SELECT idAluno, nome, matricula, cpf FROM aluno");
		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			System.out.println("ID DO ALUNO: " + resultSet.getInt("idAluno"));
			System.out.println("NOME DO ALUNO: " + resultSet.getString("nome"));
			System.out.println("MATRICULA DO ALUNO: " + resultSet.getString("matricula"));
			System.out.println("CPF DO ALUNO: " + resultSet.getString("cpf"));

		}

		connection.close();
	}

}
