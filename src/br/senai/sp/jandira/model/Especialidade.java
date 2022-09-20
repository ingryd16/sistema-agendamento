package br.senai.sp.jandira.model;

public class Especialidade {
	private String nome;
	private String descricao;

	// Métodos de acesso getters e setters
	//get/set nome
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public String getNome() {
		return nome;
	}
	
	//get/set descrição
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}