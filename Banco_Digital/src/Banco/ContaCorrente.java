package Banco;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirEstrato() {
		System.out.println("=== Saldo Da Conta Corrente ===");
		super.informacoesBancarias();
		
		
	}

}
