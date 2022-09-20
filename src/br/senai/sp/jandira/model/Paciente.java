package br.senai.sp.jandira.model;

public class Paciente {
	private String nome;
	private String email;
	private PlanoDeSaude planoDeSaude;
	private String rg;
	private String cpf;
	private String telefone;
	private Generos genero;
	private String tipoSanguineo;
	private Endereco endereco;
	
	// Métodos de acesso
	// get/set nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// get/set email
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	// get/set plano de saude
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	// get/set cpf
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	// get/set rg
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	// get/set telefone
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// get/set sexo
	public Generos getSexo() {
		return genero;
	}

	public void setSexo(Generos genero) {
		this.genero = genero;
	}

	// get/set tipo sanguineo
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	// get/set endereço
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
}
