
import java.util.Scanner;

class Pet {
	private String nome, raca;
	private int idade;

	public Pet() {

	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public String toString() {
		return this.nome + " " + this.raca + " " + this.idade;
	}

}

public class QuartaQuestao { // PetTeste
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Pet p1 = new Pet();
		p1.setNome(input.nextLine());
		p1.setRaca(input.nextLine());
		p1.setIdade(input.nextInt());

		input.nextLine();

		Pet p2 = new Pet();
		p2.setNome(input.nextLine());
		p2.setRaca(input.nextLine());
		p2.setIdade(input.nextInt());

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}
}
