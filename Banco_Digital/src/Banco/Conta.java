package Banco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public abstract class Conta implements InterfaceConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;

	private static  int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
		}
	
	protected double juros;
	
	protected double getJuros() {
		return juros;
	}
	
	protected void juros(double valor) {
		
		saldo = (valor * 0.005872 ) + valor;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}

// Mesmo sem dinheiro na conta corrente  ele deposita na conta poupança//	
	
	@Override
	public void sacar(double valor) {
		
		
		try {
			TratamentoDeErros s = new TratamentoDeErros(valor, saldo);
			System.out.println(s.TratamentoDeErros());
			
		}catch (RuntimeException e) {
		
			System.out.println(e.getMessage());
			
		}
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		
		if(valor == 0 && saldo == 0) {
			System.out.println("Nenhum valor foi depositado:");
		}else {
			saldo += valor;
		}
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		contaDestino.juros(valor);
	}
/* só deveria receber juros se o dinheiro passar o periodo de 30 dias uteis
 * falta essa correção.
 */
	protected void informacoesBancarias() {
		System.out.println(String.format("Titular : %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia : %d",this.agencia));
		System.out.println(String.format("Conta : %d",this.conta));
		System.out.println(String.format("Saldo : %.2f",this.saldo));
		System.out.println(String.format("Cpf : %s",this.cliente.getCpf()));
		
		LocalDateTime agora = LocalDateTime.now();
        
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
		String agoraFormatado = agora.format(formatter);
        
		System.out.println(agoraFormatado);
	}
}
