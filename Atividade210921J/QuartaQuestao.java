
import java.util.Scanner;

public class QuartaQuestao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma frase:");
		String frase = input.nextLine();

		System.out.println("Digite alguma palavra dessa frase que deseja substituir:");
		String palavra = input.next();

		if (frase.contains(palavra)) {
			System.out.println("Digite uma nova palavra para realizar a substituição:");
			String novaPalavra = input.next();

			String novaFrase = frase.replaceAll(palavra, novaPalavra);

			System.out.println("A nova frase é esta:\n" + novaFrase);
		} else {
			System.out.println("Essa palavra não existe na frase em questão.");
		}

		input.close();
	}
}