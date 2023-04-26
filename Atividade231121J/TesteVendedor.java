public class TesteVendedor {
	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("Mario Zé", "Tabajara", "3233-3221", 6, 7865.65, 50, 5000, 10);

		System.out.println(v1.getNome());
		System.out.println(v1.getEndereco());
		System.out.println(v1.getTelefone());
		
		System.out.println(v1.getCodigoSetor());
		System.out.println(v1.getSalarioBase());
		System.out.println(v1.getImposto());

		System.out.println(v1.getValorVendas());
		System.out.println(v1.getComissao());
		System.out.println(v1.calcularSalario());
		

	}
}