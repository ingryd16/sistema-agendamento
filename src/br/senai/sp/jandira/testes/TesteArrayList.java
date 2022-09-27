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

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {
	public static void main(String[] args) {
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");

		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		planos.add(plano1);
		planos.add(plano3);

		// looping while
		System.out.println("********** WHILE **********");
		int i = 0;
		while (i < planos.size()) {
			System.out.println(planos.get(i).getOperadora());
			i++;
		}
		System.out.println("-----------------");
		System.out.println("Saiu do looping!!");
		System.out.println("");
		System.out.println("");

		// looping for
		// for (contador;condição;acumulador){
		// }

		System.out.println("********** FOR **********");
		for (int contador = 0; contador < planos.size(); contador++) {
			System.out.println(planos.get(contador).getOperadora());
		}
		System.out.println("-----------------");
		System.out.println("Saiu do looping!!");
		System.out.println("");
		System.out.println("");
		
		//interaçao em listas - arraylist
		System.out.println("********** FOR EACH **********");
		for (PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		System.out.println("-----------------");
		System.out.println("Saiu do looping!!");
		System.out.println("");
		System.out.println("");
		
		//criar 3 especialidades e guarda-las em um arraylist. exibir o nome usando for each
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardiologista");
		e1.setDescricao("Cuida do coração");
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Otorrino");
		e2.setDescricao("Cuida do ouvido");
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Fisioterapia");
		e3.setDescricao("Cuida dos ossos");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		
		System.out.println("********** TESTE **********");
		for (Especialidade e : especialidades) {
			System.out.printf(e.getNome(), e.getDescricao());
		}
		System.out.println("-----------------");
		System.out.println("Saiu do looping!!");
		System.out.println("");
		System.out.println("");
		
		
		
		
	}
}
