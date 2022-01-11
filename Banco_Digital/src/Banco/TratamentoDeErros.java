package Banco;

public class TratamentoDeErros extends Exception{
	
	protected double valor;
	protected double saldo;

	/**
	 * @param message
	 * @param saldo
	 */
	public TratamentoDeErros(double valor, double saldo) {
		if(valor == 0 && saldo == 0) 
			throw new RuntimeException("N�o h� saldo na conta corrente");
		this.saldo = saldo;
		this.valor = valor;		
	}


	public String[] TratamentoDeErros() {
		return null;
		// TODO Auto-generated method stub
	
	}
	
	

}
