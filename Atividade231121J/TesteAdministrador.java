public class TesteAdministrador {
	public static void main(String[] args) {
		Administrador a1 = new Administrador("José Vitor", "Tabajara", "97843-7843", 2, 2000, 10, 500);

		System.out.println(a1.getNome());
		System.out.println(a1.getEndereco());
		System.out.println(a1.getTelefone());
		System.out.println(a1.getCodigoSetor());
		System.out.println(a1.getSalarioBase());
		System.out.println(a1.getImposto());
		System.out.println(a1.getAjudaDeCusto());
		System.out.println(a1.calcularSalario());

	}
}