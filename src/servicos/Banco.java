package servicos;
import java.util.List;

import entidades.Conta;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
}
