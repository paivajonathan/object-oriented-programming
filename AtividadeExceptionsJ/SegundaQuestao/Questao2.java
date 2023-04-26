
import java.util.Scanner;
import java.util.InputMismatchException;

public class Questao2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Eu sei dividir!");

		double r;

		while(true) {
			try {
				System.out.print("Informe o primeiro valor: ");
				int x = teclado.nextInt();

				System.out.print("Informe o segundo valor: ");
				int y = teclado.nextInt();

				r = x / y;

				break;
			
			} catch (InputMismatchException e1) {
				System.out.println("Por favor, digite um valor numérico válido em ambos os campos.");
				teclado.next();
				continue;
			} catch (ArithmeticException e2) {
				System.out.println("Por favor, digite um valor não nulo no segundo campo.");
				continue;
			} catch (Exception e3) {
				System.out.println("Ocorreu um erro desconhecido.");
				System.out.println(e3.getMessage());
				continue;
			}

		}
			
		System.out.println("O resultado da divisão é " + r);
		teclado.close();

	}

}