class Pessoa {
	private String nome, sobrenome;

	public Pessoa() {

	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public String toString() {
		return this.nome + " " + this.sobrenome;
	}

}

public class PrimeiraQuestao { // PessoaTeste
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", "Carlos");
		Pessoa p2 = new Pessoa("José", "Gustavo");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}