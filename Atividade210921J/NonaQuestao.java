
import java.util.Scanner;

public class NonaQuestao {

	static int maiorNumero(int[] vetor, int tamanho) {
		int temp;

		for (int i = 0; i < tamanho; i++) {
			for (int j = i + 1; j < tamanho; j++) {
				if (vetor[i] > vetor[j]) {
					temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}

		return vetor[tamanho - 1];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[10];

		System.out.println("Digite 10 números:");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}

		System.out.println("O maior número contido no vetor é " + maiorNumero(vetor, vetor.length) + ".");

		input.close();
	}
}