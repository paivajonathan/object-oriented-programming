
import java.util.Scanner;

public class TesteFormaGeometrica {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FormaGeometrica[] formas = new FormaGeometrica[100];

		System.out.println("Quantas formas geométricas deseja criar? (Quantidade máxima = 100)");
		int qtdFormas = input.nextInt();

		if (qtdFormas <= 0 || qtdFormas > 100) {
			System.out.println("Digite uma quantidade adequada!");
			return;
		}

		int i = 0;

		while (i < qtdFormas) {
			System.out.println("Deseja criar um Quadrado, um Retângulo ou um Círculo?");
			String resposta = input.next();

			if (resposta.equalsIgnoreCase("Quadrado")) {
				System.out.println("Digite o valor do lado desse quadrado:");

				formas[i] = new Quadrado(input.nextDouble());
			} else if (resposta.equalsIgnoreCase("Retângulo") || resposta.equalsIgnoreCase("Retangulo")) {
				System.out.println("Digite o valor da Base desse retângulo:");
				double base = input.nextDouble();

				System.out.println("Digite o valor da Altura desse retângulo:");
				double altura = input.nextDouble();

				formas[i] = new Retangulo(base, altura);
			} else if (resposta.equalsIgnoreCase("Círculo") || resposta.equalsIgnoreCase("Circulo")) {
				System.out.println("Digite o valor do Raio desse círculo:");

				formas[i] = new Circulo(input.nextDouble());
			} else {
				System.out.println("Digite o nome de alguma das formas geométricas especificadas.");
				continue;
			}

			i++;
		}

		System.out.println("Aqui estão os dados de todas as formas criadas:");
		for (int count = 0; formas[count] != null; count++) {
			System.out.println(formas[count].mostrarDados());
			System.out.println();
		}

		System.out.println("Aqui estão os perímetros de todas as formas criadas:");
		for (int count = 0; formas[count] != null; count++) {
			System.out.println(formas[count].calcularPerimetro());
			System.out.println();
		}

		System.out.println("Aqui estão as áreas de todas as formas criadas:");
		for (int count = 0; formas[count] != null; count++) {
			System.out.println(formas[count].calcularArea());
			System.out.println();
		}

	}
}