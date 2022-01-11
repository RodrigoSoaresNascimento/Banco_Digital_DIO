package Banco;

import java.util.List;
import java.util.Set;

public class Banco {
	private String nome;
	private String cpf;
	/* aqui a Set é melhor pois cada cpf é unico e se o usuario digitar um cpf 
	 * repetido ele não será adicionado, já nome pode ser alterado em razão de 
	 * casamento ou outros motivos
	 */
	private Set <Conta> cpfContas;
	
	protected String getCpf() {
		return cpf;
	}

	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}

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

	protected Set<Conta> getCpfContas() {
		return cpfContas;
	}

	
	
	
}
