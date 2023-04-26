public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;

	public Vendedor() {

	}

	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {

		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);

		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return this.valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return this.comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return (getSalarioBase() - getSalarioBase() * (getImposto() / 100)) + this.valorVendas * (this.comissao / 100);
	}	
	
}