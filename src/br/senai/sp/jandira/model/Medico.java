package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {
	private String nome;
	private LocalDate dataDeNascimento;
	private Generos genero;
	private Especialidade[] especialidades;
	private String crm;

	//set/get nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//set/get dataDeNascimento
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	//set/get sexo
	public String getSexo() {
		return genero;
	}

	public void setSexo(String sexo) {
		this.genero = sexo;
	}
	
	//set/get especialidades
	public Especialidade[] getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Especialidade[] especialidades) {
		this.especialidades = especialidades;
	}

	//set/get crm
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

}
