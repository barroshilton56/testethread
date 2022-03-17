package paciente.dao;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import crud.Paciente;
import factory.Conexao;

public class CadastroDAO {
	
	public void Cadastrar(Paciente paciente) {
		String sql = "INSERT INTO paciente (nome, endereco, dataNascimento, observacao) VALUES (?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.creatConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, paciente.getNomePaciente());
			pstm.setString(2, paciente.getEndereco());
			pstm.setString(3, paciente.getDataNascimento());
			pstm.setString(4, paciente.getObservacoes());
			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
