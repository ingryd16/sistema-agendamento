/* package br.senai.sp.jandira.testes;
 * import java.util.ArrayList;
 * 
 * import br.senai.sp.jandira.model.PlanoDeSaude;
 * 
 * public class TesteArrayList {
 * 
 * public static void main(String[] args) { // vetor com 3 planos de saude
 * PlanoDeSaude plano1 = new PlanoDeSaude(); plano1.setOperadora("Unimed");
 * plano1.setTipoDoPlano("Bronze");
 * 
 * PlanoDeSaude[] planos = { plano1, new PlanoDeSaude("Porto Seguro"), new
 * PlanoDeSaude("Allianz", "Ouro") };
 * 
 * System.out.println(planos[0].getOperadora());
 * System.out.println(planos[0].getTipoDoPlano());
 * System.out.println(planos[1].getOperadora());
 * System.out.println(planos[1].getTipoDoPlano());
 * System.out.println(planos[2].getOperadora());
 * System.out.println(planos[2].getTipoDoPlano());
 * 
 * //Utilização do arraylist ArrayList<String> cidades = new ArrayList<>();
 * cidades.add("sao paulo"); cidades.add("jandira"); cidades.add("barueri");
 * cidades.add("itapevi"); cidades.add("cotia"); cidades.add("carapicuiba");
 * System.out.println(cidades.get(5)); System.out.println(cidades.size());
 * 
 * ArrayList<PlanoDeSaude> planos2 = new ArrayList<>(); planos2.add(new
 * PlanoDeSaude("notredame")); planos2.add(new
 * PlanoDeSaude("ativia, advanced")); planos2.add(new
 * PlanoDeSaude("bio saude")); planos2.add(new
 * PlanoDeSaude("blue med, exclusive"));
 * 
 * PlanoDeSaude planoNovo = new PlanoDeSaude();
 * planoNovo.setOperadora("ameplan"); planoNovo.setTipoDoPlano("prata");
 * planos2.add(planoNovo);
 * 
 * //add o tipo do plano no plano notredame
 * planos2.get(0).setTipoDoPlano("basic");
 * System.out.println(planos2.get(4).getDadosDoPlano());
 * System.out.println(planos2.get(0).getDadosDoPlano());
 * /////////////////////////////////////////////////////
 * 
 * ArrayList<Double> precosList = new ArrayList<>(); precosList.add(5.9); }
 * 
 * }
 */
package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {
		public static void main(String[] args) { 
			PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
			PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
			
			PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO ();
			dao.gravar(plano1);
			dao.gravar(plano2);


			
			System.out.println(dao.listarTodos());
}}
