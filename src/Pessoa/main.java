package Pessoa;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		ListaPessoas l = new ListaPessoas();
		
		GregorianCalendar cal = new GregorianCalendar(1930,Calendar.NOVEMBER,20);
		Date aniversario = cal.getTime();

		//Adiciona pessoa na lista
		Pessoa p = new Pessoa("Luiz Felipe", "luizfelipe@outlook.com", aniversario);
		
		System.out.println(l.add(p));
		l.add(p);
		
		cal = new GregorianCalendar(1930,Calendar.NOVEMBER,20);
		aniversario = cal.getTime();
		
		p = new Pessoa("João Gilberto", "Joaogilberto@hotmail.com", aniversario);
		l.add(p);
		
		p = new Pessoa("Bernardo", "Bernardo@gmail.com", aniversario);
		l.add(p);
		
		p = new Pessoa("Luiz Carlos", "LuizCarlos@outlook.com", aniversario);
		l.add(p);
		
		//Gera a idade
		System.out.println("Idade da última pessoa adicionada");
		System.out.println(p.calculaIdade());
		System.out.println();
		
		//Pesquisa feita por idade
		System.out.println("Pessoas com 91 anos");
		System.out.println(l.pesquisaIdade(91));
		System.out.println();
		
		//Pesquisa mês de aniversario
		System.out.println("Pessoas que fazem aniversário em Novembro");
		System.out.println(l.pesquisaMes(11));
		System.out.println();
		
		//Lista com pessoas
		System.out.println("Lista completa");
		System.out.println(l.getLista());
		System.out.println();
		
		//Remove pessoa por nome
		l.removeNome("Bernardo");
		System.out.println("Lista após x pessoa ser removida");
		System.out.println(l.getLista());
		System.out.println();
		
		//Editar pessoa
		cal = new GregorianCalendar(2000,Calendar.JANUARY,2);
		aniversario = cal.getTime();
		l.alteraPessoa(1, "Claudia", aniversario, "claudia@yahoo.com");
		
		//Busca dominios de email
		System.out.println(l.pesquisaEmails());
		
		List<Pessoa> lista = l.getLista();
		System.out.println();
		
		for (Pessoa item : lista) {
			System.out.println(item.toString());
		}
		
	}

}