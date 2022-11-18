package Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

	private List<Pessoa> lista = new ArrayList<Pessoa>();

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	// Somente adicionar se o nome não for igual nenhum outro da lista ou com menos
	// de 3 letras
	public boolean add(Pessoa pessoa) {

		if (pessoa.getNome().length() < 3 || pesquisaNome(pessoa)) {
			return false;
		} else {
			lista.add(pessoa);
			return true;
		}
	}

	// Pesquisa por nome
	public boolean pesquisaNome(Pessoa pessoa2) {
		for (Pessoa p : lista) {
			if (pessoa2.getNome() == p.getNome())
				return true;
		}
		return false;
	}

	public List<Pessoa> pesquisaIdade(int idade) {
		List<Pessoa> listaIdade = new ArrayList<Pessoa>();

		for (Pessoa p : lista) {
			if (p.calculaIdade() > idade) {
				listaIdade.add(p);
			}
		}

		return listaIdade;
	}

	public List<Pessoa> pesquisaMes(int mes) {
		List<Pessoa> listaMes = new ArrayList<Pessoa>();

		for (Pessoa p : lista) {
			if (p.getidade().getMonth() == (mes - 1)) {
				listaMes.add(p);
			}
		}
		return listaMes;
	}

	public void removeNome(String nome) {
		this.lista.removeIf(pessoa -> pessoa.getNome().equals(nome));
	}

	public void alteraPessoa(int id, String nome, java.util.Date aniversario, String email) {
		lista.get(id).setNome(nome);
		lista.get(id).setidade(aniversario);
		lista.get(id).setEmail(email);
	}

	public ArrayList<String> pesquisaEmails() {

		ArrayList<String> emails = new ArrayList<String>();

		for (Pessoa p : lista) {

			String split[] = p.getEmail().split("@");

			if (!emails.contains(split[1])) {
				emails.add(split[1]);
			}

		}
		return emails;
	}
}
