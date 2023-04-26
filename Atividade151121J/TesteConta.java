public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("Joaozinho", 1000.0);

		Conta c2 = new Conta("Zezinho", 2000.0);

		Conta c3 = new Conta("Luizinho", 3000.0);

		System.out.println(Conta.getTotalDeContas());

		
	}
}