public class Conta {
	private String titular;
	private double saldo;
	private static int totalDeContas = 0;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;

		Conta.totalDeContas++;
		
	}


	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}



	
     @Override
	public String toString() {
		return String.format("Titular: %s, Saldo: %f", this.titular, this.saldo);
	}

	
}