package Banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente Rodrigo = new Cliente("Rodrigo", "004.987.489.85");
		
		Conta cc = new ContaCorrente(Rodrigo);
		
		Conta poupanca = new ContaPoupanca(Rodrigo);
		
		cc.depositar(0);
		
		cc.transferir(0, poupanca);
		
		cc.imprimirEstrato();
		
		poupanca.imprimirEstrato();
		
	}

}
