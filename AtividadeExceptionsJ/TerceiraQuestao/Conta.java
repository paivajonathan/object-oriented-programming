public class Conta {
	private double saldo;
	private double limite;

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getLimite() {
		return this.limite;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) throws ContaExcecao {
		if (valor > saldo) {
			throw new ContaExcecao("Valor superior ao saldo da conta!!");
		} else {
			saldo -= valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}

}