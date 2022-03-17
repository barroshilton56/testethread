package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	//usuario
	private static final String USUARIO = "root";
	
	//senha
	private static final String SENHA = "";
	
	//caminho DB
	private static final String URL_DATABASE = "jdbc:mysql://localhost:3306/pacientes";
	
	//conexao
	public static Connection creatConnectionToMySQL() throws Exception {

		//Cria conexao com banco de dados
		Connection connection = DriverManager.getConnection(URL_DATABASE, USUARIO, SENHA);
		
		return connection;
	}
	//Recupera conexao
	public static void main(String[] args) throws Exception {
		Connection con = createConnectionToMySQL();
		
		if (con != null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
		
	}
	private static Connection createConnectionToMySQL() {
		// TODO Auto-generated method stub
		return null;
	}

}
