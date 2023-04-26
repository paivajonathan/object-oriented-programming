
import java.util.Scanner;

public class DecimaQuestao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] alturas = new double[10];
		double somaAlturas = 0;

		System.out.println("Digite a altura de 10 atletas:");

		for (int i = 0; i < alturas.length; i++) {
			alturas[i] = input.nextDouble();
			somaAlturas += alturas[i];
		}

		double media = somaAlturas / alturas.length;

		System.out.println("Essas são as alturas acima da média:");

		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > media) {
				System.out.println(alturas[i]);
			}
		}

		input.close();
	}
}