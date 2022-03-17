package aplicacao;

import crud.Paciente;
import paciente.dao.CadastroDAO;

public class Main {

	public static void main(String[] args) {
		
		CadastroDAO cadastroDao = new CadastroDAO();
		
		Paciente paciente = new Paciente();
		paciente.setCodigoPaciente(1);
		paciente.setNomePaciente("Paciente Teste");
		paciente.setEndereco("Rua Teste, 123");
		paciente.setDataNascimento("2022-08-02");
		paciente.setObservacoes("Observação de Teste");
		
		cadastroDao.Cadastrar(paciente);

	}

}
