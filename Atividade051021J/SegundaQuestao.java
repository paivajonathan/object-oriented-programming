class Funcionario {
	private int mat;
	private String nome;
	private String funcao;
	private double salario;

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getMat() {
		return this.mat;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getFuncao() {
		return this.funcao;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}

	public String toString() {
		return String.format("Matrícula: %d, Nome: %s, Função: %s, Salário: %f", this.mat, this.nome, this.funcao, this.salario);
	}
}

public class SegundaQuestao { // FuncionarioTeste
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setMat(2142142);
		f1.setNome("José");
		f1.setFuncao("Atendente de Caixa");
		f1.setSalario(1200);

		Funcionario f2 = new Funcionario();
		f2.setMat(4324212);
		f2.setNome("João");
		f2.setFuncao("Repositor");
		f2.setSalario(1100);

		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}
}