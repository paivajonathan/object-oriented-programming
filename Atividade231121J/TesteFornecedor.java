public class TesteFornecedor {
	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("Joao", "Pindamonhangaba", "4002-8922", 10000, 5000);

		Fornecedor f2 = new Fornecedor("José", "Acapulco", "3323-5978", 1000, 1000000);

		System.out.println("Saldo do primeiro: " + f1.obterSaldo());
		System.out.println("Saldo do segundo: " + f2.obterSaldo());

	}
}