
import java.util.Scanner;

public class QuintaQuestao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma frase:");
		String frase = input.nextLine();

		System.out.println("Escolha uma palavra dessa frase:");
		String palavra = input.next();

		if (frase.contains(palavra)) {
			System.out.println("O índice dessa palavra na frase é " + 
			frase.indexOf(palavra) + ".");

		} else {
			System.out.println("Essa palavra não existe na frase em questão.");
		}

		input.close();
	}
}