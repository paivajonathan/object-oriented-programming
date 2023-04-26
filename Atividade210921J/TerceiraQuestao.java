
import java.util.Scanner;

public class TerceiraQuestao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = input.nextLine();

		for (int i = 0; i < nome.length(); i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(nome.charAt(j));
			}

			System.out.println();
		}

		input.close();
	}
}