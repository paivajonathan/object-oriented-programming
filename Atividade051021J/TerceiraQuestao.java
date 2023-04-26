
import java.util.Scanner;

class Veiculo {
	private String modelo, cor;
	private int ano;

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}

	public Veiculo() {

	}

	public Veiculo(String modelo, String cor, int ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public String toString() {
		return this.modelo + " " + this.cor + " " + this.ano;
	}

}

public class TerceiraQuestao { // VeiculoTeste
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Veiculo v1 = new Veiculo(input.nextLine(), input.next(), input.nextInt());

		input.nextLine(); // precisa dessa linha para funcionar

		Veiculo v2 = new Veiculo(input.nextLine(), input.next(), input.nextInt());

		System.out.println(v1.toString());
		System.out.println(v2.toString());

	}
}