package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("x");
		
		System.out.println(especialidade.getNome());
		
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("unimed");
		plano.setTipoDoPlano("bronze");

		JOptionPane.showMessageDialog(null, plano.getDadosDoPlano());
		
		PlanoDeSaude planoBradesco = new PlanoDeSaude();
		planoBradesco.setOperadora("bradesco");
		planoBradesco.setTipoDoPlano("ouro");
		JOptionPane.showMessageDialog(null, planoBradesco.getOperadora());
		JOptionPane.showMessageDialog(null, planoBradesco.getTipoDoPlano());
		JOptionPane.showMessageDialog(null, planoBradesco.getDadosDoPlano());

	}

}
