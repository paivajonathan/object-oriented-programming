
import java.util.Scanner;

public class SegundaQuestao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = input.nextLine();

		input.close();

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}
}