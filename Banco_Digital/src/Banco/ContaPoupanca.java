package Banco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void imprimirEstrato() {
		System.out.println("=== Saldo Da Conta Poupança ===");
		super.informacoesBancarias();
	}
	
	
	
}
