package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.PreparedStatement;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException{

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES(?)";
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setString(1, nome);
		
		statement.execute();
		
		System.out.println("Pessoa incluida com sucesso! ");
		
		entrada.close();
	}

}
