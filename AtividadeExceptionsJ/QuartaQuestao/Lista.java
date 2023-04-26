public class Lista {
	private int[] valores;

	public Lista() {
		valores = new int[5];
	}

	public Lista(int tamanho) throws ListaException {
		if (tamanho <= 0 || tamanho > 2147483647) {
			throw new ListaException("Valor inválido para o tamanho da lista!!");
		} else {
			valores = new int[tamanho];
		}
	}

	public void inserir(int pos, int valor) throws ListaException {
		if (pos < 0 || pos > (valores.length - 1) ) {
			throw new ListaException("Valor inválido para o parâmetro de posição!!");
		} else if (valor < -2147483648 || valor > 2147483647) {
			throw new ListaException("Digite um número válido para o parâmetro 'valor' !!");
		} else {
			valores[pos] = valor;
		}
	}

	public void inserir(int pos, int valor, int valor2) throws ListaException {

		if (pos < 0 || pos > (valores.length - 1) ) {
			throw new ListaException("Valor inválido para o parâmetro de posição!!");
		} else if (valor < -2147483648 || valor > 2147483647) {
			throw new ListaException("Digite um número válido para o parâmetro 'valor' !!");
		} else if (valor2 < -2147483648 || valor2 > 2147483647) {
			throw new ListaException("Digite um número válido para o parâmetro 'valor2' !!");
		} else if (valor2 == 0) {
			throw new ListaException("O parâmetro 'valor2' não pode ser 0.");
		} else {
			valores[pos] = valor / valor2;
		}
	}

	public void printValores() {
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i] + " ");
		}

		System.out.println();
	}
}