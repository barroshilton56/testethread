package crud;

public class Paciente {
	
	private int codigoPaciente;
	private String nomePaciente;
	private String dataNascimento;
	private String endereco;
	private String observacao;
	
	public Paciente (String nomePaciente, String endereco, String dataNascimento, String observacao) {
		this.nomePaciente = nomePaciente;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.observacao = observacao;
	}
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getObservacoes() {
		return observacao;
	}
	public void setObservacoes(String observacao) {
		this.observacao = observacao;
	}

}
