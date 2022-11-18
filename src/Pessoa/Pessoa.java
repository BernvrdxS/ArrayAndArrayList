package Pessoa;

import java.util.Date;

public class Pessoa {

	private String nome;
	private String email;
	private Date idade;

	public Pessoa(String nome, String email, Date idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 3)
			this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getidade() {
		return idade;
	}

	public void setidade(Date idade) {
		this.idade = idade;
	}
	
	public int calculaIdade() {
		Date aniversario = new Date();
		return aniversario.getYear() - idade.getYear();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}


}
