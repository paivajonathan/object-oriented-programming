
import java.util.Scanner;

public class PrimeiraQuestao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um texto qualquer:");
		String texto = input.nextLine();

		System.out.println("Esse texto tem exatos " + texto.length() + 
		" caracteres.");

		input.close();
	} 
}