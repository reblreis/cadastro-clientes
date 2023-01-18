package entities;

public class Cliente {

	// atributos (campos)

	private Integer idCliente; // número inteiro
	private String nome; // texto
	private String telefone;
	private String email;
	private String cpf;

	// Encapsulamento (set/get) = proteger campos e fornecer funções para preencher
	// dados de cada cliente
	// Herança e Polimorfismo
	// Para cada atributos
	// de entrada de dados e saída de dados
	// set -> nome da função para entrada de dados
	// get -> nome da função para saída de dados

	// função para preenchimento do campo idCliente
	// public = outras classes tem o acesso a esta classe
	// = indica que recebe 

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	// função para saída (retorno) do campo idCliente
	public Integer getIdCliente() {
		return idCliente;
	}

	// função para preenchimento do campo nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// função para saída (retorno) do campo nome
	public String getNome() {
		return nome; // CTRL+SHIFT+F = formata o código
	}

	// função para preenchimento do campo telefone
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// função para saída (retorno) do campo telefone
	public String getTelefone() {
		return telefone;
	}

	// função para preenchimento do campo email
	public void setEmail(String email) {
		this.email = email;
	}

	// função para saída (retorno) do campo email
	public String getEmail() {
		return email;
	}

	// função para preenchimento do campo cpf
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// função para saída (retorno) do campo cpf
	public String getCpf() {
		return cpf;
	}
	
}
