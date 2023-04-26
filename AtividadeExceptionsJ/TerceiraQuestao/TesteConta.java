public class TesteConta {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();

		try {
			minhaConta.depositar(100);
			minhaConta.setLimite(100);
			minhaConta.sacar(1000);
		} catch (ContaExcecao e1) {
			System.out.println("Ocorreu um erro!");
			System.out.println(e1.getMessage());
		} catch (Exception e2) {
			System.out.println("Ocorreu um erro desconhecido!");
			System.out.println(e2.getMessage());
		}
		
	}
	
}