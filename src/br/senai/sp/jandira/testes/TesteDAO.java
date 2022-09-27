package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
		
		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		dao.gravar(plano1);
		dao.gravar(plano2);
		
		for (PlanoDeSaude plano : PlanoDeSaudeDAO.listarTodos()) {
			System.out.println(plano.getOperadora());
		}
		
		PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
		dao.gravar(plano3);
		dao.gravar(plano4);
		
		for (PlanoDeSaude plano : PlanoDeSaudeDAO.listarTodos()) {
			System.out.println(plano.getOperadora());
		}
		
		
		
		
	}
}
