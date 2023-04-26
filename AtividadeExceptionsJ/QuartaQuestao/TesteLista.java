public class TesteLista {
	public static void main(String[] args) {
		
		try {
			Lista lista = new Lista(10);
			lista.inserir(5, 2);
			lista.inserir(2, 9, 3);
			lista.inserir(10, 3);
			lista.inserir(4, 4, 0);
			lista.printValores();
		} catch (ListaException e) {
			System.out.println("Ocorreu um erro!");
			System.out.println(e.getMessage());
		}
	}
}