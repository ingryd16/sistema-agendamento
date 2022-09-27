package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Generos;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {

		// especialidades
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Fisioterapia");
		especialidade3.setDescricao(
				"Atua no tratamento e prevenção de doenças/lesões, decorrentes de fraturas, má-formação ou vícios de postura. Tem como aliados técnicas que restauram a capacidade física e funcionam do pacientes.");

		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Gastroenterologia");

		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Clinica Geral");

		// planos
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Unimed");
		plano1.setTipoDoPlano("Bronze");

		PlanoDeSaude plano2 = new PlanoDeSaude("Bradesco", "Ouro");

		PlanoDeSaude plano3 = new PlanoDeSaude("Amil");

		// endereços
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Rua Elton Silva");
		endereco1.setNumero("905");
		endereco1.setBairro("Centro");
		endereco1.setCidade("Jandira");
		endereco1.setEstado(Estados.SAO_PAULO);
		endereco1.setComplemento("Escola");
		endereco1.setPontoDeReferencia("Em frente à prefeitura");
		endereco1.setCep("06600-025");

		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Av Barao de Limeira");
		endereco2.setNumero("158");
		endereco2.setBairro("Santa Cecilia");
		endereco2.setCidade("Sao Paulo");
		endereco2.setEstado(Estados.SAO_PAULO);
		endereco2.setComplemento("Escola");
		endereco2.setCep("06658-006");

		// medicos
		Medico medico1 = new Medico();
		medico1.setNome("Ana Paula");
		medico1.setCrm("8956-78");
		medico1.setGenero(Generos.FEMININO);
		medico1.setDataDeNascimento(LocalDate.of(1997, 5, 15));
		// a dra ana é clinica geral e fisioterapeuta
		Especialidade[] especialidades = { especialidade3, especialidade5 };
		medico1.setEspecialidades(especialidades);
		// System.out.println(especialidades[1].getNome());
		// System.out.println(especialidades[0].getDescricao());

		Medico medico2 = new Medico();
		medico2.setNome("Pedro Oliveira");
		medico2.setCrm("8696-30");
		medico2.setGenero(Generos.MASCULINO);
		medico2.setDataDeNascimento(LocalDate.of(1984, 8, 20));
		// é clinico geral, fisioterapeuta e cardiologista
		Especialidade[] especialidades2 = { especialidade3, especialidade5, especialidade1 };
		medico2.setEspecialidades(especialidades2);

		// pacientes
		Paciente paciente1 = new Paciente();
		paciente1.setCpf("510.137.308-79");
		paciente1.setEmail("ingryddasilva7@gmail.com");
		paciente1.setEndereco(endereco1);
		paciente1.setNome("Ingryd Shirlley");
		paciente1.setPlanoDeSaude(plano1);
		paciente1.setRg("52.463.646-1");
		paciente1.setGenero(Generos.FEMININO);
		paciente1.setTelefone("11949676202");
		paciente1.setTipoSanguineo("A+");

		Paciente paciente2 = new Paciente();
		paciente2.setNome("Layla Giovanna Furtado da Silva");
		paciente2.setEmail("laylagiovanna27@gmail.com");
		paciente2.setRg("50.128.581-7");
		paciente2.setCpf("451.022.128.26");
		paciente2.setTelefone("(11)97136-4704");
		paciente2.setGenero(Generos.FEMININO);
		paciente2.setTipoSanguineo("O+");
		paciente2.setPlanoDeSaude(plano2);
		paciente2.setEndereco(endereco2);

		System.out.println("NOME:" + paciente1.getNome());
		System.out.println("CIDADE:" + paciente1.getEndereco().getCidade());
		System.out.println("ESTADO:" + paciente1.getEndereco().getEstado());
		System.out.println("TELEFONE:" + paciente1.getTelefone());
		System.out.println("OPERADORA:" + paciente1.getPlanoDeSaude().getOperadora());
		System.out.println("-------------------");
		System.out.println("NOME:" + paciente2.getNome());
		System.out.println("CIDADE:" + paciente2.getEndereco().getCidade());
		System.out.println("ESTADO:" + paciente2.getEndereco().getEstado());
		System.out.println("TELEFONE:" + paciente2.getTelefone());
		System.out.println("OPERADORA:" + paciente2.getPlanoDeSaude().getOperadora());

		Agenda agenda1 = new Agenda();
		agenda1.setEspecialidade(especialidade5);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(15, 25));
		agenda1.setMedico(medico1);
		agenda1.setObservacao("O paciente é diabetico.");
		agenda1.setPaciente(paciente1);

		System.out.println("");
		System.out.println("");
		System.out.println("------------AGENDA 1:-------------");
		System.out.println("NOME: " + agenda1.getPaciente().getNome());
		System.out.println("ESPECIALIDADE: " + agenda1.getEspecialidade().getNome());
		System.out.println("MEDICO: " + agenda1.getMedico().getNome());
		System.out.println("DATA: " + agenda1.getDataDaConsulta() + " - " + agenda1.getHoraDaConsulta());
		System.out.println("OBSERVAÇÃO: " + agenda1.getObservacao());
		System.out.println("PLANO: " + agenda1.getPaciente().getPlanoDeSaude().getOperadora());

		Agenda agenda2 = new Agenda();
		agenda2.setEspecialidade(especialidade1);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 9, 26));
		agenda2.setHoraDaConsulta(LocalTime.of(9, 00));
		agenda2.setMedico(medico2);
		agenda2.setObservacao("O paciente é asmático.");
		agenda2.setPaciente(paciente2);

		System.out.println("");
		System.out.println("------------AGENDA 2:-------------");
		System.out.println("NOME: " + agenda2.getPaciente().getNome());
		System.out.println("ESPECIALIDADE: " + agenda2.getEspecialidade().getNome());
		System.out.println("MEDICO: " + agenda2.getMedico().getNome());
		System.out.println("DATA: " + agenda2.getDataDaConsulta() + " - " + agenda2.getHoraDaConsulta());
		System.out.println("OBSERVAÇÃO: " + agenda2.getObservacao());
		System.out.println("PLANO: " + agenda2.getPaciente().getPlanoDeSaude().getOperadora());

		System.out.println("PLANO: " + plano3.getOperadora());

	}

}
